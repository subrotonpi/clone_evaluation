public static int solution (int X, int [] A) {

    Set < Integer > values = new HashSet < Integer > ();

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if (values.add (A [X1])) X --;

        if (X == 0) return X1;

    }

    return - 1;

}
