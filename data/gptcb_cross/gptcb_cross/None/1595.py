def solution(S, P, Q):
    answer = []
    chars = list(S)
    cumulativeAnswers = [[0 for x in range(len(chars) + 1)] for y in range(4)]

    for iii in range(len(chars)):
        if iii > 0:
            for zzz in range(4):
                cumulativeAnswers[zzz][iii + 1] = cumulativeAnswers[zzz][iii]

        if chars[iii] == 'A':
            cumulativeAnswers[0][iii + 1] += 1
        elif chars[iii] == 'C':
            cumulativeAnswers[1][iii + 1] += 1
        elif chars[iii] == 'G':
            cumulativeAnswers[2][iii + 1] += 1
        elif chars[iii] == 'T':
            cumulativeAnswers[3][iii + 1] += 1

    for iii in range(len(P)):
        for zzz in range(4):
            if (cumulativeAnswers[zzz][Q[iii] + 1] - cumulativeAnswers[zzz][P[iii]]) > 0:
                answer.append(zzz + 1)
                break

    return answer