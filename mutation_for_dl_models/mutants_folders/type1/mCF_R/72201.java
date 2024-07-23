private static int [] removeEven (int [] k, int n) {

    for (int i = 0;

    i < n; i ++) {

        if (k [i] % 2 == 0) {

            for (int j = i + 1;

            j < n; j ++) {

                if (k [j] % 2 != 0) {

                    k [i] = k [i] + k [j];

                    k [j] = k [i] - k [j];

                    k [i] = k [i] - k [j];
                     break;

                }

            }

        }

    }

    return k;

}
