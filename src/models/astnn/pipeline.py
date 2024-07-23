import pandas as pd
import os
import sys
import warnings
warnings.filterwarnings('ignore')

class Pipeline:
    def __init__(self,  ratio, root, bench):
        self.dataset = '/student/egk204/projects/clone-type-iv/data/'
        self.ratio = ratio
        self.root = root
        self.bench = bench
        self.sources = None
        self.blocks = None
        self.pairs = None
        self.train_file_path = '/student/egk204/projects/clone-type-iv/data/gptcb/train.csv'
        self.dev_file_path = '/student/egk204/projects/clone-type-iv/data/gptcb/valid.csv'
        self.test_file_path = '/student/egk204/projects/clone-type-iv/data/gptcb/test.csv'
        self.size = None
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
    def parse_source(self, output_file, option):
        path = self.root+'/'+output_file
        import javalang
        def parse_program(text):
            # tokens = javalang.tokenizer.tokenize(func)
            # parser = javalang.parser.Parser(tokens)
            # tree = parser.parse_member_declaration()
            # return tree
            try:
                programtokens = javalang.tokenizer.tokenize(text)
                parser = javalang.parse.Parser(programtokens)
                tree = parser.parse_member_declaration()
                return tree
            except:
                programtokens = javalang.tokenizer.tokenize(text)
                tree = javalang.parser.parse(programtokens)
                return tree
        
        #print(self.root)
        jf = self.dataset+self.bench+'/data.jsonl'
        source = self.jsonl_to_df(jf)
        
        #pd.read_csv(self.root + self.bench + '/scb_funcs_all.tsv', sep='\t', header=None, encoding='utf-8')
        source.columns = ['idx', 'func']
        print(source.head(1))
        source['func'] = source['func'].apply(parse_program)
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
        train = pd.read_csv(dataset_path+'train.csv', names=k)
        dev = pd.read_csv(dataset_path+'valid.csv', names=k)
        test = pd.read_csv(dataset_path+'test.csv', names=k)
        
        self.pairs = pd.concat([train, test, dev])

        data_path = self.root+self.bench+'/'
        
                
        train_path = data_path+'train/'
        self.check_or_create(train_path)
        self.train_file_path = train_path+'train_.pkl'
        train.to_pickle(self.train_file_path)

        dev_path = data_path+'dev/'
        self.check_or_create(dev_path)
        self.dev_file_path = dev_path+'dev_.pkl'
        dev.to_pickle(self.dev_file_path)

        test_path = data_path+'test/'
        self.check_or_create(test_path)
        self.test_file_path = test_path+'test_.pkl'
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

        word2vec = Word2Vec.load(self.root+self.bench+'/train/embedding/node_w2v_' + str(self.size)).wv
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
        df.to_pickle(self.root+self.bench+'/'+part+'/blocks.pkl')
        
    def fix_(self,dt):
        root = self.root
        lang = self.bench
        
        df = pd.read_pickle(root+lang+'/'+dt+'/blocks.pkl').sample(frac=1)
        r = []
        for ind, row in df.iterrows():
            if(len(row.func_x)>0 and len(row.func_y)>0):
                r.append(list(row))
        xr = pd.DataFrame(r, columns=['id1', 'id2', 'label', 'func_x', 'func_y'])
        xr.to_pickle(root+lang+'/'+dt+'/blocks.pkl')
    # run for processing data to train
    def run(self):
        print('parse source func...')
        self.parse_source(output_file=self.bench+'/ast.pkl',option='existing')
      
        print('read_pairs and split...')
        self.read_data()
        
        print('train word embedding...')
        self.dictionary_and_embedding(None,128)
        print('generate block sequences...')
        self.generate_block_seqs()
        print('merge pairs and blocks...')
        self.merge(self.train_file_path, 'train')
        self.merge(self.dev_file_path, 'dev')
        self.merge(self.test_file_path, 'test')
        # self.fix_('train')


import argparse    
ppl = Pipeline('3:1:1', '/student/egk204/projects/clone-type-iv/src/models/astnn/data/','gptcb')# str(args.lang))
ppl.run()