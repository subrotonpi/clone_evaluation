def sequenceNums(nums):
    sb = []
    if nums == None or len(nums) == 0:
        return ""
    begin = nums[0]
    end = nums[0]
    for cur in nums:
        if cur - end <= 1:
            end = cur
        else:
            appendRange(sb, begin, end)
            begin = end = cur
    appendRange(sb, begin, end)
    return ",".join(sb[1:])