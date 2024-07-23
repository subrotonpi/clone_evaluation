def shuffle_array(array):
    list = []
    for i in array:
        list.append(i)

    random.shuffle(list)

    for i in range(len(list)):
        array[i] = list[i]