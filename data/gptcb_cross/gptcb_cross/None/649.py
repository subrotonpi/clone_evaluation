matrix = [[1, 2, 2], [2, 2, 3], [0, 1, 2]]
resultL2R = 1
resultR2L = 1
for i in range(3):
    resultL2R *= matrix[i][i]
    resultR2L *= matrix[i][2-i]
print("left-to-right: ", resultL2R)
print("right-to-left: ", resultR2L)
