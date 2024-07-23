public static void shuffle (Object [] a) {

    int n = a.length;

    for (int i = 0;

    i < n; i ++) {

        int r = i + (int) (Math.random () * (n - i,X1));

        Object swap = a [r];

        a [r] = a [i];

        a [i] = swap;

    }

}
