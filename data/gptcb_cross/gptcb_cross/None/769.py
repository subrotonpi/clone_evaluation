def generateRandomPassword (length):
    if length < 1:
        raise ValueError('length must be greater than 0')
    buf = [characters[random.randint(0,len(characters)-1)] for _ in range(length)]
    return ''.join(shuffle(buf))