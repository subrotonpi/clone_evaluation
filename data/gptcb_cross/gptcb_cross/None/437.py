def isPrime(value):
    hp = int(math.sqrt(value))
    for i in range(2, hp+1):
        if value % i == 0:
            return False
    return True