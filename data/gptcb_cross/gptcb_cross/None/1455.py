def tortoiseMoves():
    move = tGen()
    if move == 1 or move == 2 or move == 3 or move == 4 or move == 5:
        return 3
    elif move == 6 or move == 7 or move == 8:
        return 1
    elif move == 9 or move == 10:
        return -6
    else:
        return 0