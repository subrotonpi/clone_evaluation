public static int solution (int X, int [] A) {

    Set < X1 > values = new HashSet < X1 > ();

    for (int i = 0;

    i < A.length; i ++) {

        if (values.add (A [i])) X --;

        if (X == 0) return i;

    }

    return - 1;

}
