public static void main (String [] args) {

    int x = 123456789;

    System.out.println ("x = " + x);

    int X1 = x, n = 0;

    while (X1 > 9) {

        X1 /= 10;

        ++ n;

    }

    for (int i = 0;

    i < n; i ++) X1 *= 10;

    x -= X1;

    System.out.println ("x with high digit removed = " + x);

}
