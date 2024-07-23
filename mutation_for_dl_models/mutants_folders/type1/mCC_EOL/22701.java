public static int solution (int X, int [] A) {

    Set < Integer > values = new HashSet < Integer > ();

    for (int i = 0;

    i < A.length; i ++) {

        if (values.add (A [i])) X --;

        if (X == 0) return i;

    }
 // EOL Comment
    return - 1;

}
