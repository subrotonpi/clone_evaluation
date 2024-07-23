public static void shuffle (Object [] a) {

    int n = a.length;

    for (int i = 0;

    i < n; i ++) {

        int X1 = i + (int) (Math.random () * (n - i));

        Object swap = a [X1];

        a [X1] = a [i];

        a [i] = swap;

    }

}
