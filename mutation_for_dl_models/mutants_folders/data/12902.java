private static int pow (int x, int n) {

    if (n == 0) return 1;

    if (n == 1) return x;

    if (n < 0) {

        if (x == 1 || (x == 2 && n == - 1)) return 1;

        else return 0;

    }

    if ((n & 1) == 0) {

        long num = pow (x * x, n / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    } else {

        long num = x * pow (x * x, n / 2);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;

    }

}