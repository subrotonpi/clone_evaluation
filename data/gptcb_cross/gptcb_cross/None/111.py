def solution(N):
    gap = 0
    binaryStr = '{0:b}'.format(N)
    zeroArrays = binaryStr.split('1')
    print(zeroArrays)
    for zeroArray in zeroArrays: 
        if gap < len(zeroArray):
            gap = len(zeroArray)
    return gap