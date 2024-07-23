def findCombinationsCount(amount, coins, checkFromIndex):
    if (amount == 0):
        return 1
    elif (amount < 0 or len(coins) == checkFromIndex):
        return 0
    else:
        withFirstCoin = findCombinationsCount((amount - coins[checkFromIndex]), coins, checkFromIndex)
        withoutFirstCoin = findCombinationsCount(amount, coins, (checkFromIndex + 1))
        return (withFirstCoin + withoutFirstCoin)