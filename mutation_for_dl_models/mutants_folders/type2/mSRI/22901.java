public static int solution (int X, int [] A) {

    Set < Integer > X1 = new HashSet < Integer > ();

    for (int i = 0;

    i < A.length; i ++) {

        if (X1.add (A [i])) X --;

        if (X == 0) return i;

    }

    return - 1;

}