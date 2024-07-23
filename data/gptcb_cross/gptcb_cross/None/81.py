def sequenceNums (nums):
    if not nums:
        return ""
    begin = nums[0]
    end = nums[0]
    sb = []
    for num in nums:
        if num - end <= 1:
            end = num
        else:
            appendRange(sb, begin, end)
            begin = end = num
        appendRange(sb, begin, end)
    return ''.join(sb)[1:]
def appendRange(sb, begin, end):
    sb.append(",{}-{}".format(begin, end) if begin != end else ",{}".format(begin))