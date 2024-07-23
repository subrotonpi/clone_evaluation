def solution(A):
    mark = [0] * (len(A) + 1)
    counter = 0
    for i in range(len(A)):
        value = A[i]
        if value >= len(mark):
            return NOT_PERMUTATION
        if mark[value] == 0:
            mark[value] = 1
            counter += 1
        else:
            return NOT_PERMUTATION
    return PERMUTATION if counter == len(A) else NOT_PERMUTATION