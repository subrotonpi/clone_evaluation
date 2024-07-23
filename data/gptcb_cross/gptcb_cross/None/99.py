def haveThree(nums):
    count = 0
    flag = False
    for i in range(len(nums)):
        if nums[i] == 3:
            if flag:
                return False
            else:
                count += 1
                flag = True
        else:
            flag = False
    return count == 3