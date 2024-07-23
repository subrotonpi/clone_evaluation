public int solution (final int X, final int [] A) {

    Set < Integer > emptyPosition = new HashSet < Integer > ();

    for (int X1 = 1;

    X1 <= X; X1 ++) {

        emptyPosition.add (X1);

    }

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        emptyPosition.remove (A [X1]);

        if (emptyPosition.size () == 0) {

            return X1;

        }

    }

    return - 1;

}
