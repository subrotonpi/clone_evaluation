N = int(input())
nums = [i for i in range(N)]
import random
for i in range(N):
    randomIndex = random.randint(0,N)
    randomValue = nums[randomIndex]
    nums[randomIndex], nums[i] = nums[i], randomValue
