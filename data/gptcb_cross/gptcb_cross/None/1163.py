import os
filePath = "D:\\Test.txt"
if os.path.exists(filePath):
    xSum = 0
    ySum = 0
    with open(filePath, 'r') as myfile:
        data=myfile.readlines()
    for line in data:
        if "x=" in line:
            xSum += int(line.split("=")[1])
        elif "y=" in line:
            ySum += int(line.split("=")[1])
    
    print("Sum x is:", xSum, "Sum y is:", ySum)
else:
    print("No such file present")
