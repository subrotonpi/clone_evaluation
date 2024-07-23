static String transpose (String X1, int rows, int columns) {

    int n = X1.length ();

    if (rows * columns != n) throw new IllegalArgumentException ();

    StringBuilder sb = new StringBuilder ();

    for (int i = 0;

    i < n - 1; i ++) sb.append (X1.charAt (i * columns % (n - 1)));

    sb.append (X1.charAt (n - 1));

    return sb.toString ();

}
