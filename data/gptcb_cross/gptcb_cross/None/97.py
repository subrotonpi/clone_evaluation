def solution(X, A):
    unique_elements = set()
    sum1 = 0
    sum2 = 0
    for i in range(0, X+1):
        sum1 += i
    for i in range(0, len(A)):
        if A[i] in unique_elements:
            continue
        unique_elements.add(A[i])
        sum2 += A[i]
        if sum1 == sum2:
            return i
    return -1