def singleNumber(nums): 
    unique = set() 
    for num in nums: 
        if num not in unique: 
            unique.add(num) 
        else: 
            unique.remove(num) 
    return unique.pop()