def all_unique_combinations():
    n = len(dataStructure.keys())
    solutions = 1
    for vector in dataStructure.values():
        solutions *= len(vector)
    all_combinations = [[None] * (solutions + 1)]
    all_combinations[0] = list(dataStructure.keys())
    for i in range(solutions):
        combination = [None] * n
        j = 1
        for vec in dataStructure.values():
            combination[i] = vec[(i / j) % len(vec)]
            j *= len(vec)
        all_combinations[i+1] = combination
    return all_combinations