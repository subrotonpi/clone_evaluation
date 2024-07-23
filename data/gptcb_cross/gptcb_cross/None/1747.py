def singleNumber (nums):
    answer = 0
    seen_nums = []
    for n in nums:
        if n in seen_nums:
            seen_nums.remove(n)
        else:
            seen_nums.append(n)
    for n in seen_nums:
        answer = n
    return answer