public static int findCombinationsCount (int X1, int vals []) {

    if (X1 < 0) {

        return 0;

    }

    if (vals == null || vals.length == 0) {

        return 0;

    }

    int dp [] = new int [X1 + 1];

    dp [0] = 1;

    for (int i = 0;

    i < vals.length; ++ i) {

        for (int j = vals [i];

        j <= X1; ++ j) {

            dp [j] += dp [j - vals [i]];

        }

    }

    return dp [X1];

}
