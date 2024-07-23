private static int pow (int X1, int n) {

    if (n == 0) return 1;

    if (n == 1) return X1;

    if (n < 0) {

        if (X1 == 1 || (X1 == 2 && n == - 1)) return 1;

        else return 0;

    }

    if ((n & 1) == 0) {

        long num = pow (X1 * X1, n / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    } else {

        long num = X1 * pow (X1 * X1, n / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    }

}
