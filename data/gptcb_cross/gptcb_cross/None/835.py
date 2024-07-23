unique = {}
for i in "House, House, House, Dog, Dog, Dog, Dog".split(", "):
    if i not in unique:
        unique[i] = 1
    else:
        unique[i] = unique[i] + 1 
uniqueString = ", ".join(list(unique.keys()))
value = list(unique.values())
print("Output = " + uniqueString)
print("Values = " + str(value))
