temp = 0
for i in range(3):
    print("I am here")
    for j in range(20):
        if temp == 0:
            print("j: ", j)
            if j == 1:
                temp=j
                continue
print("temp = ", temp)
