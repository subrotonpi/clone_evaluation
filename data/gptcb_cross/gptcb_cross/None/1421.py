def count8(num):
    count = 0
    double = False
   
    while True:
        n = num % 10
        num = num // 10
        if n == 8:
            if double == True:
                count += 2
            else:
                count += 1
            double = True
        else:
            double = False
        if num == 0:
            break
    return count