def main(args):
    keyboard = input()
    concatenated = keyboard
    cumSum = 0
    helperIndex = []
    for i in range(1, len(keyboard), 2):
        helperIndex.append(i)
        cumSum += i
    for i in range(len(keyboard), 0, -2):
        helperIndex.append(i)
        cumSum += i
    numOfWordRepitition = cumSum//len(keyboard)
    for i in range(numOfWordRepitition):
        concatenated += keyboard
    substr = ''
    prev = helperIndex[0]
    next = helperIndex[0]
    substr = concatenated[0: helperIndex[0]]
    print(substr[0].upper() + substr[1:])
    for i in range(1, len(keyboard)):
        next += helperIndex[i]
        substr = concatenated[prev:next]
        substr = substr[0].upper() + substr[1:]
        print(substr)
        prev = next