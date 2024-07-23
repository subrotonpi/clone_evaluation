def removeAdjacentDuplicates(input):
    if len(input) <= 1:
        return input
    result = input[0]
    for i in range(1, len(input)):
        if input[i] != input[i-1]:
            result += input[i]
    return result