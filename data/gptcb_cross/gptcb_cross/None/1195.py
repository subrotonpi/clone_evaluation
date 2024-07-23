def maxBlock(str):
    max = 0
    count = 1
    o = ' '
    for i in range(len(str)):
        c = str[i]
        if c == o:
            count += 1
            if count > max:
                max = count
        else:
            count = 1
            if count > max:
                max = count
        o = c
    return max