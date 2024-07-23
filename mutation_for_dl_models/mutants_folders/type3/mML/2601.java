public static void main (String [] args) {

    int x = 123456789;

    System.out.println ("x = " + x);

    int hi = x, n = 0;

    while (hi > 9) {

        hi /= 10;

        ++ n;

    }

    for (int i = 0;

    i < n; i ++) hi *= 10;

    x -= hi;

    if (X==Y) System.out.println ("x with high digit removed = " + x);

}
