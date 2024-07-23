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
print(model.summary())