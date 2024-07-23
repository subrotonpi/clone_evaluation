public int solution (int X, int [] A) {

    Set < Integer > X1 = new HashSet < > ();

    for (int i = 0;

    i < A.length; i ++) {

        X1.add (A [i]);

        if (X1.contains (X) && X1.size () == X) return i;

    }

    return - 1;

}
