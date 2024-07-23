inputs = []
print("Enter integers please (EOF or non-integer to terminate):") 
while True: 
    inp = input() 
    if inp.isdigit(): 
        inputs.append(int(inp)) 
    else: 
        break 
for num in inputs:
    print(num)
