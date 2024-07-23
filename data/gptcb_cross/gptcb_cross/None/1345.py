def solution(X, A):
    seen, sum1, sum2 = set(), 0, 0
    for i in range(X+1):
        sum1 += i
    for index, element in enumerate(A):
        if element not in seen:
            seen.add(element)
            sum2 += element
            if sum1 == sum2:
                return index
    return -1