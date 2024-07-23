arr = []
for i in range(5):
    print("Enter number " + str(i+1) + ": ")
    arr.append(int(input()))
    
for i in range(5):
    print("Number " + str(i+1) + ": " + str(arr[i]))
