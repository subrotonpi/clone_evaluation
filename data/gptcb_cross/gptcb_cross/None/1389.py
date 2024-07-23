def main(): 
    for i in range(9): 
        for j in range(9): 
            for k in range(9): 
                if condition1: 
                    print("Breaking from Loop K and J") 
                    k = 9
                    j = 9
                if condition2: 
                    print("Breaking from Loop K, J and I") 
                    k = 9
                    j = 9
                    i = 9
    print("End of I , J , K")