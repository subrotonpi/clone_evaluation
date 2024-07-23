int findCombinationsCount (int X1, int coins [], int checkFromIndex) {

    if (X1 == 0) return 1;

    else if (X1 < 0 || coins.length == checkFromIndex) return 0;

    else {

        int withFirstCoin = findCombinationsCount (X1 - coins [checkFromIndex], coins, checkFromIndex);

        int withoutFirstCoin = findCombinationsCount (X1, coins, checkFromIndex + 1);

        return withFirstCoin + withoutFirstCoin;

    }

}
