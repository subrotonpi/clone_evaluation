def solution(x, a):  
    count = [0] * x  
    for i in range(len(a)):  
        try:
            count[a[i] - 1] += 1
        except: 
            continue 
        if i >= x - 1:  
            for j in range(len(count)):  
                if count[j] == 0:  
                    break  
                if j == len(count) - 1:  
                    return i 
    return -1