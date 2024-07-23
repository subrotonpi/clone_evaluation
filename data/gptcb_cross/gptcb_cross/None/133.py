def solution(x, a):
    set_a = set()
    sum1, sum2 = 0, 0
    
    for i in range (x+1):
        sum1 += i
    
    for i in range(len(a)):
        if (a[i] in set_a):
            continue
        set_a.add(a[i])
        sum2 += a[i]
        if sum1 == sum2:
            return i
    return -1