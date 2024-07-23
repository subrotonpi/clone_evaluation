def tortoiseMoves():
    tortoise_gen = tGen()
    if tortoise_gen in range(1, 6):
        return 3
    elif tortoise_gen in range(6, 9):
        return 1
    elif tortoise_gen in range(9, 11):
        return -6
    else:
        return 0