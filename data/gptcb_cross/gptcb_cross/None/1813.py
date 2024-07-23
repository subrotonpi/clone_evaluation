x = 123456789
originalLog = math.floor(math.log10(x))
getRidOf = int(math.pow(10,originalLog))
while originalLog == math.floor(math.log10(x)):
    x -= getRidOf
print(x)
