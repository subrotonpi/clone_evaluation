def sort(input_list, startIndx, endIndx):
    endIndexOrig = endIndx
    startIndexOrig = startIndx
    if startIndx >= endIndx:
        return
    pavitVal = input_list[endIndx]
    while startIndx <= endIndx:
        while input_list[startIndx] < pavitVal:
            startIndx += 1
        while input_list[endIndx] > pavitVal:
            endIndx -= 1
        if startIndx <= endIndx:
            tmp = input_list[startIndx]
            input_list[startIndx] = input_list[endIndx]
            input_list[endIndx] = tmp
            startIndx += 1
            endIndx -= 1
    sort(input_list, startIndexOrig, endIndx)
    sort(input_list, startIndx, endIndexOrig)