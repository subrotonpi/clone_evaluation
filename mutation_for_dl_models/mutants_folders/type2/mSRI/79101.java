int findCombinationsCount (int amount, int coins []) {

    if (coins.length == 1) {

        return amount % coins [0] == 0 ? 1 : 0;

    } else {

        int X1 = 0;

        int [] subCoins = arrayOfCoinsExceptTheFirstOne (coins);

        for (int i = 0;

        i * coins [0] <= amount; ++ i) {

            X1 += findCombinationsCount (amount - i * coins [0], subCoins);

        }

        return X1;

    }

}
