def main (args): 
    largestSize = 4
    array = [33, 55, 13, 46, 87, 42, 10, 34]
    large = array.copy()[:largestSize] 
    smallest = large[0] 
    smallestIndex = 0 
    for j in range(1, len(large)): 
        if (smallest > large[j]): 
            smallest = large[j] 
            smallestIndex = j 
    for i in range(len(large), len(array)): 
        if (smallest < array[i]): 
            large[smallestIndex] = array[i] 
            smallest = large[0] 
            smallestIndex = 0 
            for j in range(1, len(large)): 
                if (smallest > large[j]): 
                    smallest = large[j] 
                    smallestIndex = j 
    for j in range(0, len(large)): 
        print("Largest 5: ", large[j]) 
    print() 
    print("Largest is: ", getHighest(large))