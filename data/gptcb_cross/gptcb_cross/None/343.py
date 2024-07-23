def rotate (nums, k):
    if k > len(nums):
        k = k % len(nums)
    result = [0] * len(nums)
    result[:k] = nums[-k:]
    result[k:] = nums[:-k]
    nums = result
    return result