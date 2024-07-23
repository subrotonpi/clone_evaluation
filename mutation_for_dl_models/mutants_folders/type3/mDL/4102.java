public static void shuffle (Object [] a) {

    int n = a.length;

    for (int i = 0;

    i < n; i ++) {

        int r = i + (int) (Math.random () * (n - i));


        a [r] = a [i];

        a [i] = swap;

    }

}
