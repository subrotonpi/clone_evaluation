import sys
sys.path.append("/Users/antique/projects/clone-type-iv/")
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
import pandas as pd
from sklearn.metrics import classification_report, confusion_matrix
from sklearn.model_selection import KFold
from sklearn.model_selection import train_test_split
from sklearn.metrics import precision_score , recall_score, f1_score
from tensorflow.keras.models import load_model, Model
from tensorflow.python.keras import backend as K

class SiameseModel:
    def __init__(self):
        #export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$CONDA_PREFIX/lib/
        #export CUDA_VISIBLE_DEVICES=1
        #os.environ["CUDA_DEVICE_ORDER"] = "PCI_BUS_ID"
        #os.environ["CUDA_VISIBLE_DEVICES"] = "GPU:0"
        # GPU enabled for
        #tf.compat.v1.keras.backend.
        # sess = tf.compat.v1.keras.backend.Session(config=tf.compat.v1.ConfigProto(log_device_placement=True))
        sess = tf.compat.v1.Session(config=tf.compat.v1.ConfigProto( allow_soft_placement=True, log_device_placement=True))
        K.clear_session()
        K.set_session(sess)
        #self.dataset = dor_train
        get_custom_objects().update({'activation': Activation(self.custom_activation)})

    @tf.keras.utils.register_keras_serializable()
    def custom_activation(self, x):
        return 1 / (1 + tf.exp(-tf.reduce_sum(x, axis=-1, keepdims=True)))

    def build_model(self, shape = 9):

        # first initialization layer
        model1_Input = Input(shape=(shape,))
        model1_hidden1 = Dense(100, activation='relu', kernel_initializer='he_normal')(model1_Input)
        model1_dropout1 = Dropout(0.2)(model1_hidden1)
        model1_hidden2 = Dense(100, activation='relu', kernel_initializer='he_normal')(model1_dropout1)
        model1_output = Dropout(0.2)(model1_hidden2)


        # second Initialization layer
        model2_Input = Input(shape=(shape,))
        model2_hidden1 = Dense(100, activation='relu', kernel_initializer='he_normal')(model2_Input)
        model2_dropout1 = Dropout(0.2)(model2_hidden1)
        model2_hidden2 = Dense(100, activation='relu', kernel_initializer='he_normal')(model2_dropout1)
        model2_output = Dropout(0.2)(model2_hidden2)

        # Comparator model
        merged_model = concatenate([model1_output, model2_output])
        comparator_layer1 = Dense(100, activation='relu', kernel_initializer='he_normal')(merged_model)
        comparator_layer1_Dropout = Dropout(0.2)(comparator_layer1)
        comparator_layer2 = Dense(50, activation='relu', kernel_initializer='he_normal')(comparator_layer1_Dropout)
        comparator_layer2_Dropout = Dropout(0.2)(comparator_layer2)
        comparator_layer3 = Dense(10, activation='relu', kernel_initializer='he_normal')(comparator_layer2_Dropout)
        comparator_layer3_Dropout = Dropout(0.2)(comparator_layer3)
        compilation_layer = SingleConnected()(comparator_layer3_Dropout)
        final_output = Dense(1, activation='sigmoid')(compilation_layer)

        model = Model(inputs=[model1_Input, model2_Input], outputs=final_output)
        
        
        return model
    

if __name__ == "__main__":
    si_model = SiameseModel()
    model = si_model.build_model()
    
    #print(model.summary())
    #print(model.count_params())
    #quit()
    #expr_dir = '/home/egk204/PycharmProjects/code-clone-multilingual/'
    #ds_name = 'storage/alternative/alt_ft_clcdsa_large.csv'
    # f = '/home/egk204/PycharmProjects/clone-type-iv/src/cross/clcdsa_model/dataset_final/scb_None.csv'
     #dataset = pd.read_csv(expr_dir+ds_name).to_numpy()
    def get_X_Y(f):
        dataset = pd.read_csv(f, header=None).to_numpy()
        X = dataset[:, 0:18] 
        print(type(X[0:1,0:1]))
        y = dataset[:, 18]
        print(type(y[0]))
        return X, y
    X_train, y_train = get_X_Y("gptcb/clcdsa_gptcb_java_train.csv")
    X_test, y_test = get_X_Y("gptcb/clcdsa_gptcb_java_test.csv")
    

    # X_train, X_test, y_train, y_test = train_test_split( X, y, test_size=0.1, shuffle=True, random_state=42)
    
    epochs =  55
    batch_size =  3000
    print('here')
    with tf.device("gpu:0"):
        print("tf.keras code in this scope will run on GPU")
        #create model
        si_model = SiameseModel()
        model = si_model.build_model()
        optimizer = Adagrad(
            learning_rate=0.001,
            initial_accumulator_value=0.1,
            epsilon=1e-07,
            name="Adagrad",
        ) #SGD(learning_rate=0.0001, decay=0.03,)
        model.compile(loss='binary_crossentropy', 
                        optimizer=optimizer, 
                        metrics=['accuracy'])
        #train model
        history = model.fit(
            [X_train[:,:9], X_train[:,9:18]], 
            y_train, 
            validation_data=([X_test[:,:9], X_test[:,9:18]], y_test),
            epochs=epochs, 
            batch_size=batch_size,
            verbose=2) 
        
        _, accuracy = model.evaluate([X_train[:,:9], X_train[:,9:18]], y_train)
        print('Accuracy on training set: %.2f' % (accuracy * 100))
        
        #evaluated on separated test set
        y_preds = (model([X_test[:,:9], X_test[:,9:18]]) > 0.5)
        y_preds = np.array(y_preds)
        
        file_object = open('result_gptcb.txt', 'a')
        t= 'Precision:' + str(precision_score(y_test, y_preds))+' Recall:'+str(recall_score(y_test, y_preds))+' F-1:'+str(f1_score(y_test, y_preds)) +'\n'
        
        file_object.write(t)
        file_object.close()
        print(t)
        
        #save model    
        model.save('model_trained_gptcb.h5')
        print("Model Saved to disk")
