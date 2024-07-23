data = [[97, 36, 79], [94, 74, 60], [68, 76, 58], [64, 87, 56], [68, 27, 73], [74, 99, 42], [7, 93, 87], [51, 69, 40], [38, 23, 33], [57, 86, 31]]
data1 = []
data2 = []
data3 = []
for x in data:
  for y in range(len(x)):
    if y==0:
      data1.append(x[y])
    elif y==1:
      data2.append(x[y])
    elif y==2:
      data3.append(x[y])
for i in range(len(data1)):
  print(data1[i], data2[i], data3[i]) 
