def solution (X, A): 
    empty_positions = set()
    for num in range(1, X+1):
        empty_positions.add(num)
        
    for index, num in enumerate(A):
        if num in empty_positions:
            empty_positions.remove(num)
        if len(empty_positions) == 0:
            return index
            
    return -1