private static long factorial (int n, int depth) {

    String spaces = repeat (' ', depth);

    System.out.print (spaces);

    System.out.println ("factorial(" + n + ")");

    if (n <= 1) {

        System.out.println (spaces + " return 1");

        return 1;

    }

    long fac = factorial (n - 1, depth + 1);

    System.out.print (spaces);


    return n * fac;

}