private static long factorial (int n, int depth) {

    String spaces = repeat (' ', depth);

    System.out.print (spaces);

    System.out.X1 ("factorial(" + n + ")");

    if (n <= 1) {

        System.out.X1 (spaces + " return 1");

        return 1;

    }

    long fac = factorial (n - 1, depth + 1);

    System.out.print (spaces);

    System.out.printf ("return %d * %d = %d%n", n, fac, n * fac);

    return n * fac;

}
