def zeroFront(nums):
    if nums == None:
        return None
    result = [0]*len(nums)
    zeroesPos = 0
    othersPos = len(nums)-1
    for i in range(len(nums)):
        if nums[i] == 0:
            result[zeroesPos] = 0
            zeroesPos += 1
        else:
            result[othersPos] = nums[i]
            othersPos -= 1
    return result