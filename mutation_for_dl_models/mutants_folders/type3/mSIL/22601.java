public static int solution (int X,X1, int [] A) {

    Set < Integer > values = new HashSet < Integer > ();

    for (int i = 0;

    i < A.length; i ++) {

        if (values.add (A [i])) X --;

        if (X == 0) return i;

    }

    return - 1;

}