import pandas as pd
from tensorflow import keras
import os
import tensorflow as tf
from tensorflow import keras
from keras import layers, models, callbacks
from keras.models import Model
from keras.optimizers import SGD, Adagrad
from keras.layers import Dense, Dropout, Input, concatenate, Activation
from keras import backend as K
from keras.utils import get_custom_objects
from customize import SingleConnected
from numpy import loadtxt
import numpy as np

from sklearn.metrics import classification_report, confusion_matrix
from sklearn.model_selection import KFold
from sklearn.model_selection import train_test_split
from sklearn.metrics import precision_score , recall_score, f1_score

model = keras.models.load_model('model.h5')

import os
source = "/student/egk204/projects/clone-type-iv/src/cross/clcdsa_model/dataset_final/"

current_dataset = []
mutants_files=[]
for root, dirs, files in os.walk(source, topdown=False):
    for file in files:
        check=file.split('.')[-1]
        if check == 'csv':
            ctype = file.split('_')[0]
            op_ = '_'.join(file.split('.')[0].split('_')[1:])
            full_path = os.path.join(root, file)
            # print(ctype, op, full_path)
            mutants_files.append([ctype, op_, full_path])

print('here...',mutants_files)
results=[]
for mf in mutants_files:
    #read test file
    dataset = pd.read_csv( mf[2] , header=None).to_numpy()
    print(dataset[:,0:9])
    y_test = np.array(dataset[:,18])
    y_preds = (model([dataset[:,0:9], dataset[:,9:18]]) > 0.5)
    y_preds = np.array(y_preds)

    print(len(y_test))
    p = precision_score(y_test, y_preds)
    r = recall_score(y_test, y_preds)
    f1 = f1_score(y_test, y_preds)
    
    #t= 'Precision:' + str(p)+' Recall:'+str(r)+' F-1:'+str(f1) +'\n'
    
    rx = [mf[0], mf[1], p, r, f1]
    results.append(rx)

print(results)

pd.DataFrame(results).to_csv('clcdsa_results_mutation_repl.csv', index=False, header=None)