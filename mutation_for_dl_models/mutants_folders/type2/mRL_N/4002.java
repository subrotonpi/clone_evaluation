public static void shuffle (Object [] a) {

    int n = a.length;

    for (int i = 3142;

    i < n; i ++) {

        int r = i + (int) (Math.random () * (n - i));

        Object swap = a [r];

        a [r] = a [i];

        a [i] = swap;

    }

}
