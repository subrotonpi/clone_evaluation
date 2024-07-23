def solution(S, P, Q):
    answer = [0] * len(P)
    cumulativeAnswers = [[0 for _ in range(len(S) + 1)] for _ in range(4)]
    for idx, s in enumerate(S):
        if idx > 0:
            for j in range(4):
                cumulativeAnswers[j][idx + 1] = cumulativeAnswers[j][idx]

        if s == 'A':
            cumulativeAnswers[0][idx + 1] += 1
        elif s == 'C':
            cumulativeAnswers[1][idx + 1] += 1
        elif s == 'G':
            cumulativeAnswers[2][idx + 1] += 1
        elif s == 'T':
            cumulativeAnswers[3][idx + 1] += 1

    for i, p in enumerate(P):
        for j in range(4):
            if (cumulativeAnswers[j][Q[i] + 1] - cumulativeAnswers[j][p] > 0):
                answer[i] = j + 1
                break
    return answer