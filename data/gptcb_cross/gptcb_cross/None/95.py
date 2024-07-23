def findCombinationsCount(amount, coins):
    if len(coins) == 1:
        return 1 if amount % coins[0] == 0 else 0
    else:
        total = 0
        subCoins = coins[1:]
        for i in range(amount // coins[0] + 1):
            total += findCombinationsCount(amount - i * coins[0], subCoins)
        return total