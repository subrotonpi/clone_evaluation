def shuffle(text): 
    if len(text) <= 1: 
        return text

    split = len(text) // 2 
    temp1 = shuffle(text[: split]) 
    temp2 = shuffle(text[split :]) 
    if random.random() > 0.5: 
        return temp1 + temp2
    else: 
        return temp2 + temp1