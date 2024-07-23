def solution(N):
    binary = bin(N)[2:]
    largest_gap = 0
    gap = 0
    for i in range(1, len(binary)):
        if binary[i] == '0':
            gap += 1
        else:
            if gap > largest_gap:
                largest_gap = gap
            gap = 0
    return largest_gap