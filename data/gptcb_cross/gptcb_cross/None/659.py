def main(): 
    values = ['a', 'b', 'c', 'd']
    n = len(values)
    r = 2
    i = [0] * r
    rc = 0
    while rc < int(math.pow(n, r)):
        rc = 0
        while rc < r:
            print(values[i[rc]], end=" ")
            rc += 1
        print()
        rc = 0
        while rc < r:
            if i[rc] < n - 1:
                i[rc] += 1
                break
            else:
                i[rc] = 0
            rc += 1
 
if __name__ == "__main__": 
    main()