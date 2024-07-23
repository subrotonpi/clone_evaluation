def sort(numbers, digit):
    if(len(numbers) == 0 or digit <= 0):
        return numbers
    space = [[] for _ in range(10)]
    len = [0] * 10
    for j in range(len(numbers)):
        i = (numbers[j] // digit) % 10
        len[i] += 1
        space[i].append(numbers[j])
    for i in range(10):
        bucket = [None] * len[i]
        for k in range(len[i]):
            bucket[k] = space[i][k]
        space[i] = sort(bucket, digit // 10)
    k = 0
    for i in range(10):
        for j in range(len[i]):
            numbers[k] = space[i][j]
            k += 1
    return numbers