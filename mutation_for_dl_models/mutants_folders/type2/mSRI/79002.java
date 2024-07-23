int findCombinationsCount (int amount, int X1 [], int checkFromIndex) {

    if (amount == 0) return 1;

    else if (amount < 0 || X1.length == checkFromIndex) return 0;

    else {

        int withFirstCoin = findCombinationsCount (amount - X1 [checkFromIndex], X1, checkFromIndex);

        int withoutFirstCoin = findCombinationsCount (amount, X1, checkFromIndex + 1);

        return withFirstCoin + withoutFirstCoin;

    }

}
