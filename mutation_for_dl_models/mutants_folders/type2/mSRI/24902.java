public int solution (final int X, final int [] A) {

    Set < Integer > X1 = new HashSet < Integer > ();

    for (int i = 1;

    i <= X; i ++) {

        X1.add (i);

    }

    for (int i = 0;

    i < A.length; i ++) {

        X1.remove (A [i]);

        if (X1.size () == 0) {

            return i;

        }

    }

    return - 1;

}
