def main(args): 
    lc = ['A', 'B', 'C', 'D']
    lC = ['a', 'b', 'c']
    li = [1, 2, 3, 4]
    llo = [lc, lC, li]
    ci = CartesianIterable(llo)
    for lo in ci: 
        print(lo)