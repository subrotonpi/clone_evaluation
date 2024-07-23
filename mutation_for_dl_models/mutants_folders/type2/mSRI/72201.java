private static int [] removeEven (int [] k, int n) {

    for (int X1 = 0;

    X1 < n; X1 ++) {

        if (k [X1] % 2 == 0) {

            for (int j = X1 + 1;

            j < n; j ++) {

                if (k [j] % 2 != 0) {

                    k [X1] = k [X1] + k [j];

                    k [j] = k [X1] - k [j];

                    k [X1] = k [X1] - k [j];

                    break;

                }

            }

        }

    }

    return k;

}
