def main():
    n = input() 
    left_start_diagonal = 0
    right_start_diagonal = n
    left_total = 0
    right_total = 0
    arr = [[0 for x in range (n)] for y in range (n)]    
    
    for i in range (n):
        for j in range (n):
            arr[i][j] = input()
	
    for i in range (n):
        left_not_found = True
        right_not_found = True
        right_start_diagonal -= 1
                                                                
        for j in range (n):
            if left_start_diagonal == j and left_not_found:
                left_total += arr[i][j]
                left_not_found = False
            if right_start_diagonal == j and right_not_found:
                right_total += arr[i][j]
                right_not_found = False
         
        left_start_diagonal += 1

    data = abs (left_total - right_total)
    print (data)