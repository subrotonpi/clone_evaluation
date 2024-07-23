private static int pow (int x, int X1) {

    if (X1 == 0) return 1;

    if (X1 == 1) return x;

    if (X1 < 0) {

        if (x == 1 || (x == 2 && X1 == - 1)) return 1;

        else return 0;

    }

    if ((X1 & 1) == 0) {

        long num = pow (x * x, X1 / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    } else {

        long num = x * pow (x * x, X1 / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    }

}
