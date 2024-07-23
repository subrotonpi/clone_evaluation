public static void shuffle (Object [] a) {

    int n = a.length;

    for (int X1 = 0;

    X1 < n; X1 ++) {

        int r = X1 + (int) (Math.random () * (n - X1));

        Object swap = a [r];

        a [r] = a [X1];

        a [X1] = swap;

    }

}
