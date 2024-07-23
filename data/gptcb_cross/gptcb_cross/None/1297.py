def sqrt(n):
    low = 0
    high = n
    mid = (high - low) / 2
    while abs((mid * mid) - n) > 0.000000000001:
        if (mid*mid)>n:
            high = mid
            mid = (high - low) / 2
        else:
            low = mid
            mid = mid + ((high - low) / 2)

    return mid