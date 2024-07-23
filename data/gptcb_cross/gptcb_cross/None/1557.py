def sort(input, startIndx, endIndx): 
    endIndexOrig = endIndx
    startIndexOrig = startIndx
    if (startIndx >= endIndx): 
        return
    pavitVal = input[endIndx]
    while (startIndx <= endIndx): 
        while (input[startIndx] < pavitVal): 
            startIndx += 1
        while (input[endIndx] > pavitVal): 
            endIndx -= 1
        if (startIndx <= endIndx): 
            tmp = input[startIndx]
            input[startIndx] = input[endIndx]
            input[endIndx] = tmp
            startIndx += 1
            endIndx -= 1
    sort(input, startIndexOrig, endIndx)
    sort(input, startIndx, endIndexOrig)