public static int  findCombinationsCount (int sum, int vals []) {

    if (sum < 0) {

        return 0;

    }

    if (vals == null || vals.length == 0) {

        return 0;

    }

    int dp [] = new int [sum + 1];

    dp [0] = 1;

    for (int i = 0;

    i < vals.length; ++ i) {

        for (int j = vals [i];

        j <= sum; ++ j) {

            dp [j] += dp [j - vals [i]];

        }

    }

    return dp [sum];

}
