public static void stars (int X1) {

    for (int i = 0;

    i < X1 * X1; i ++) {

        int y = i / X1, x = i % X1;

        System.out.print ((x >= y && x < X1 - y) || (x >= X1 - y - 1 && x <= y) ? '*' : ' ');

        if (x == X1 - 1) System.out.println ();

    }

}
