def solution(x, a):
    empty_position = set()
    for i in range(1, x+1):
        empty_position.add(i)
    for i in range(len(a)):
        empty_position.discard(a[i])
        if not empty_position:
            return i
    return -1