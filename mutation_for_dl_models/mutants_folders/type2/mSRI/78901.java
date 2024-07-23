public static int findCombinationsCount (int sum, int vals []) {

    if (sum < 0) {

        return 0;

    }

    if (vals == null || vals.length == 0) {

        return 0;

    }

    int dp [] = new int [sum + 1];

    dp [0] = 1;

    for (int X1 = 0;

    X1 < vals.length; ++ X1) {

        for (int j = vals [X1];

        j <= sum; ++ j) {

            dp [j] += dp [j - vals [X1]];

        }

    }

    return dp [sum];

}
