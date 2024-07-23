def main (args): 
    large = [None]*5
    array = [33, 55, 13, 46, 87, 42, 10, 34, 43, 56]
    max = 0
    index = 0
    for j in range(5):
        max = array[0]
        index = 0
        for i in range(1,len(array)):
            if max < array[i]:
                max = array[i]
                index = i
        large[j] = max
        array[index] = float('-inf')
        print("Largest "+str(j)+" : "+str(large[j]))