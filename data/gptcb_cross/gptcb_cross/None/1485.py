n=7
mid=n//2
for i in range(n):
    for j in range(abs(mid-i)+1):
        print("*", end=" ")
    print()
