import pandas as pd
import os
import sys
import warnings
warnings.filterwarnings('ignore')

class Pipeline:
    def __init__(self,  ratio, root, bench):
        self.dataset = '/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/'
        self.ratio = ratio
        self.root = root
        self.bench = bench
        self.sources = None
        self.blocks = None
        self.pairs = None
        self.train_file_path = None
        self.dev_file_path = None
        self.test_file_path = None
        self.size = None
        self.op_current_dataset = ''
        self.op=''
        self.opdir=''
        
    def jsonl_to_df(self, jf):
        import json
        import pandas as pd
        with open(jf, 'r') as json_file:
            json_list = list(json_file)
        x = []
        for json_str in json_list:
            result = json.loads(json_str)
            x.append([result['idx'], result['func']])
        
        return pd.DataFrame(x)#, columns=['idx', 'func'])
    
    # parse source func
    def parse_source(self, output_file, option, ):
        path = output_file
        import javalang
        def unparsable_replace():
            programtext=open('test.java').read()
            programtokens=javalang.tokenizer.tokenize(programtext)
            parser=javalang.parse.Parser(programtokens)
            programast=parser.parse_member_declaration()
            return programast
        def parse_program(func):
            try:
                tokens = javalang.tokenizer.tokenize(func)
                parser = javalang.parser.Parser(tokens)
                tree = parser.parse_member_declaration()
            except:
               tree=unparsable_replace()
            return tree
        #print(self.root)
        jf = self.op_current_dataset #self.dataset+self.bench+'/data.jsonl'
        print(self.op_current_dataset)
        source = self.jsonl_to_df(jf)
        
        #pd.read_csv(self.root + self.bench + '/scb_funcs_all.tsv', sep='\t', header=None, encoding='utf-8')
        source.columns = ['idx', 'func']
        print(source.head(1))
        source['func'] = source['func'].apply(parse_program)
        print(path)
        source.to_pickle(path)
        self.sources = source
        return source


    def check_or_create(self, path):
            if not os.path.exists(path):
                os.mkdir(path)
    # split data for training, developing and testing
    def read_data(self):
        #simply modify this to fixed train_test_valid data used for FA-AST
        
        dataset_path= self.dataset+self.bench+'/'
        k = ['id1', 'id2', 'label']
        
        test = pd.read_csv('/home/egk204/PycharmProjects/clone-type-iv/data/scb/scb_pairs.csv', names=k)
        
        self.pairs = test#pd.concat([train, test, dev])

        #data_path = self.opdir#'/'.join(self.op_current_dataset.split('/')[:-1]) #self.root+self.bench+'/'

        #test_path = data_path+self.op+'/'
        #self.check_or_create(test_path)
        self.test_file_path = self.opdir+'/'+self.op+'_clone_pairs_.pkl'
        test.to_pickle(self.test_file_path)

    # construct dictionary and train word embedding
    def dictionary_and_embedding(self, input_file, size):
        self.size = size
        data_path = self.root+self.bench+'/'
        if not input_file:
            input_file = self.train_file_path
        pairs = pd.read_pickle(input_file)
        train_ids = pairs['id1'].append(pairs['id2']).unique()
        print((train_ids))
        self.sources['idx'] = self.sources['idx'].astype(int)
        trees = self.sources.set_index('idx',drop=False).loc[train_ids]
        if not os.path.exists(data_path+'train/embedding'):
            os.mkdir(data_path+'train/embedding')
            
        from utils import get_sequence as func

        def trans_to_sequences(ast):
            sequence = []
            func(ast, sequence)
            return sequence
        corpus = trees['func'].apply(trans_to_sequences)
        str_corpus = [' '.join(c) for c in corpus]
        trees['func'] = pd.Series(str_corpus)
        # trees.to_csv(data_path+'train/programs_ns.tsv')

        from gensim.models.word2vec import Word2Vec
        w2v = Word2Vec(corpus, vector_size=size, workers=16, sg=1, max_final_vocab=3000)
        w2v.save(data_path+'train/embedding/node_w2v_' + str(size))

    # generate block sequences with index representations
    def generate_block_seqs(self):
        from utils import get_blocks_v1 as func
        from gensim.models.word2vec import Word2Vec

        word2vec = Word2Vec.load('/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/bcb/train/embedding/node_w2v_128').wv
        vocab = word2vec.key_to_index
        max_token = word2vec.vectors.shape[0]

        def tree_to_index(node):
            token = node.token
            result = [vocab[token] if token in vocab else max_token]
            children = node.children
            for child in children:
                result.append(tree_to_index(child))
            return result

        def trans2seq(r):
            blocks = []
            func(r, blocks)
            tree = []
            for b in blocks:
                btree = tree_to_index(b)
                tree.append(btree)
            return tree
        trees = pd.DataFrame(self.sources, copy=True)
        trees['func'] = trees['func'].apply(trans2seq)
        if 'label' in trees.columns:
            trees.drop('label', axis=1, inplace=True)
        self.blocks = trees

    # merge pairs
    def merge(self,data_path,part):
        pairs = pd.read_pickle(data_path)
        pairs['id1'] = pairs['id1'].astype(int)
        pairs['id2'] = pairs['id2'].astype(int)
        df = pd.merge(pairs, self.blocks, how='left', left_on='id1', right_on='idx')
        df = pd.merge(df, self.blocks, how='left', left_on='id2', right_on='idx')
        df.drop(['idx_x', 'idx_y'], axis=1,inplace=True)
        df.dropna(inplace=True)

        df.to_pickle(self.opdir+'/'+self.op+'_blocks.pkl')
        
    def fix_(self, dt):
        df = pd.read_pickle(dt)
        r = []
        for ind, row in df.iterrows():
            if(len(row.func_x)>0 and len(row.func_y)>0):
                r.append(list(row))
        xr = pd.DataFrame(r, columns=['id1', 'id2', 'label', 'func_x', 'func_y'])
        xr.to_pickle(dt)
    # run for processing data to train
    def run(self):
        source = "/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/mutants_json"

        current_dataset = []
        mutants_files=[]
        for root, dirs, files in os.walk(source, topdown=False):
            for file in files:
                check=file.split('.')[1]
                if check == 'jsonl':
                    ctype = root.split('/')[-1]
                    op_ = file.split('.')[0]
                    full_path = os.path.join(root, file)
                    # print(ctype, op, full_path)
                    mutants_files.append([ctype, op_, full_path])

        print(mutants_files)

        for mf in mutants_files:
            opdir= '/'.join(mf[2].split('/')[:-1])
            print(mf[1], mf[2])
            print('parse source func...', )
            self.op=mf[1]
            self.opdir = opdir
            self.op_current_dataset = mf[2]
            print(self.op_current_dataset, self.op)
            print(opdir)
            self.parse_source(output_file= opdir+'/'+self.op+'_ast.pkl',option='existing')
            print('read_pairs and split...')
            self.read_data()
            print('train word embedding...')
            #self.dictionary_and_embedding(None,128)
            print('generate block sequences...')
            self.generate_block_seqs()
            print('merge pairs and blocks...')
            # self.merge(self.train_file_path, 'train')
            # self.merge(self.dev_file_path, 'dev')
            self.merge(self.test_file_path, 'test')
            #'/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/mutants_json/type3/mML_blocks.pkl'
            self.fix_(self.opdir+'/'+self.op+'_blocks.pkl')
            
      
        
        


import argparse    
ppl = Pipeline('3:1:1', '/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/','mutants_json')# str(args.lang))
ppl.run()