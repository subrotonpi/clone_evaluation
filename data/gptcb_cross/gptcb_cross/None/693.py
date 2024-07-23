def isPerfectSquare(number):
    if number < 0:
        return False
    elif number < 2:
        return True
    else:
        i = 0
        while True:
            square = squareTable[i]
            if square > number:
                return False
            while number % square == 0:
                number = number // square
            if number == 1:
                return True
            i += 1