def isPrime(number):
    if number < 2:
        return False
    if number == 2:
        return True
    if number % 2 == 0:
        return False
    for i in range(3, number // 2, 2):
        if number % i == 0:
            return False
    return True