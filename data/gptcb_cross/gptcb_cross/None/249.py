def isPrime(n):
    if n & 1 == 0:
        return n == 2
    if n < 9:
        return n > 1
    return isStrongProbablePrime(n, 2) and isStrongProbablePrime(n, 7) and isStrongProbablePrime(n, 61)