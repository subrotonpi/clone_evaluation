def countLines(input):
    count = 1
    with open(input, 'r') as f:
        for line in f:
            count += 1
        return count