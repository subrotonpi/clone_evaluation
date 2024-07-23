def main(args):
    coins = [1, 2, 3, 4, 5]
    money = 600
    recorder = [[0 for i in range(len(coins))] for j in range(money + 1)] 
    for k in range(len(coins)):
        recorder[0][k] = 1
    for i in range(1, money + 1):
        with_index = 0
        without_index = 0
        for coin_index in range(len(coins)):
            if (i - coins[coin_index] < 0):
                with_index = 0
            else:
                with_index = recorder[i - coins[coin_index]][coin_index]
            if (coin_index - 1 < 0):
                without_index = 0
            else:
                without_index = recorder[i][coin_index - 1]
            recorder[i][coin_index] = with_index + without_index
    print(recorder[money][len(coins) - 1])