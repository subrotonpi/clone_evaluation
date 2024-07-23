def solution(X, A):
    listA = A
    summed_val = 0
    searchVal = X
    required_sum = searchVal * (searchVal + 1) / 2 
    already_encountered = []
    for iii in range(len(listA)):
        if listA[iii] <= searchVal and listA[iii] not in already_encountered:
            summed_val += listA[iii]
            if summed_val == required_sum:
                return iii
            already_encountered.append(listA[iii])
    return -1