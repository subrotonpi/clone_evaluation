def sum_function(operand,x,i,n):
    total = 0
    for limit in range(n):
        total += operand * x / i
        i += 1
    
    return total