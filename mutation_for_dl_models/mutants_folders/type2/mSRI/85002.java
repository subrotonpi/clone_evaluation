private static int countZeros (int [] f) {

    int start = 0, end = 0, X1 = 0;

    for (int i = 1;

    i < f.length; i ++) {

        if (f [i - 1] != 0 && f [i] == 0) {

            start = i;

        } else if (f [i - 1] == 0 && f [i] != 0 && start > 0) {

            end = i;

            X1 += end - start;

        }

    }

    return X1;

}
