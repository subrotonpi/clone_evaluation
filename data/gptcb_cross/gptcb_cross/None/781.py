def isPrime(x):
    for i in range(2,int(x**1/2)):
        if x%i==0:
            return False
    return True