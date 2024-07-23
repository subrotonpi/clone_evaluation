import pandas as pd
import torch
import time
import numpy as np
import warnings
from gensim.models.word2vec import Word2Vec
from model import BatchProgramCC
from torch.autograd import Variable
from sklearn.metrics import precision_recall_fscore_support
warnings.filterwarnings('ignore')
import os


def get_batch(dataset, idx, bs):
    tmp = dataset.iloc[idx: idx+bs]
    x1, x2, labels = [], [], []
    for _, item in tmp.iterrows():
        x1.append(item['func_x'])
        x2.append(item['func_y'])
        labels.append([item['label']])
    return x1, x2, torch.FloatTensor(labels)


if __name__ == '__main__':
    
    device = torch.device("cuda") if torch.cuda.is_available() else torch.device("cpu")# torch.device("cpu")#
    word2vec = Word2Vec.load('/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/bcb/train/embedding/node_w2v_128').wv
    MAX_TOKENS = word2vec.vectors.shape[0] #if word2vec.vectors.shape[0]>2993 else 2993
    EMBEDDING_DIM = word2vec.vectors.shape[1]
    embeddings = np.zeros((MAX_TOKENS + 1, EMBEDDING_DIM), dtype="float32")
    embeddings[:word2vec.vectors.shape[0]] = word2vec.vectors

    HIDDEN_DIM = 100
    ENCODE_DIM = 128
    LABELS = 1
    EPOCHS = 5
    BATCH_SIZE = 32
    USE_GPU = True#False#True# if torch.cuda.is_available() else False
    model = BatchProgramCC(EMBEDDING_DIM,HIDDEN_DIM,MAX_TOKENS+1,ENCODE_DIM,LABELS,BATCH_SIZE,
                                   USE_GPU, embeddings)
    # pytorch_total_params = sum(p.numel() for p in model.parameters() if p.requires_grad)
    # print(pytorch_total_params)
    # quit()
    saved_model_path = '/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/bcb/astnn_bcb_4'
    model.load_state_dict(torch.load(saved_model_path, map_location=device))
    model.eval()
    

    if USE_GPU:
        model.cuda()

    parameters = model.parameters()
    optimizer = torch.optim.Adamax(parameters)
    loss_function = torch.nn.BCELoss()
    
    
    source = "/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/mutants_json"

    current_dataset = []
    mutants_files=[]
    for root, dirs, files in os.walk(source, topdown=False):
        for file in files:
            check=file.split('_')[-1]
            if check == 'blocks.pkl':
                ctype = root.split('/')[-1]
                op_ = '_'.join(file.split('_')[:2])#file.split('.')[0]
                full_path = os.path.join(root, file)
                # print(ctype, op, full_path)
                mutants_files.append([ctype, op_, full_path])

    x=[]
    for mf in mutants_files:
        db = '/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/mutants_json/'
        print(mf[2])
        test_data = pd.read_pickle(mf[2])#'/home/egk204/PycharmProjects/clone-type-iv/src/models/astnn/data/mutants_json/type3/mML_blocks.pkl')
        test_data=test_data.sample(frac = 1)
        precision, recall, f1 = 0, 0, 0
        model.eval()
        print("Testing...")
        # testing procedure
        predicts = []
        trues = []
        total_loss = 0.0
        total = 0.0
        i = 0
        while i < len(test_data):
            batch = get_batch(test_data, i, BATCH_SIZE)
            i += BATCH_SIZE
            test1_inputs, test2_inputs, test_labels = batch
            if USE_GPU:
                test_labels = test_labels.cuda()

            model.batch_size = len(test_labels)
            model.hidden = model.init_hidden()
            output = model(test1_inputs, test2_inputs)

            loss = loss_function(output, Variable(test_labels))

            # calc testing acc
            predicted = (output.data > 0.5).cpu().numpy()
            predicts.extend(predicted)
            trues.extend(test_labels.cpu().numpy())
            total += len(test_labels)
            total_loss += loss.item() * len(test_labels)
            
        precision, recall, f1, _ = precision_recall_fscore_support(trues, predicts, average='binary')
        
        from datetime import datetime
        now = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
        
        res = mf[0]+' '+mf[1]+' '+str(precision)+' '+str(recall)+' '+str(f1) +'\n'
        x.append([mf[0], mf[1], precision, recall, f1])
        f = open('astnn_results_mutation.txt', 'a')
        f.write(res)
        f.close()
        print(res)
    
    import pandas as pd
    dr = pd.DataFrame(x, columns=['clone_type', 'operator', 'p', 'r','f1'])
    dr.to_csv('mutation_result_astnn.csv', index=False)    
        