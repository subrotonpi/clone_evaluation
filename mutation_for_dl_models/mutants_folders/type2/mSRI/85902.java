public static int score (final X1 gene1, final X1 gene2) {

    final char [] a;

    final char [] b;

    final int s;

    a = gene1.toCharArray ();

    b = gene2.toCharArray ();

    s = score (a, b, 0, 0);

    return (s);

}
