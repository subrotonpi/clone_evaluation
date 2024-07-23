public int solution (final int X1, final int [] A) {

    Set < Integer > emptyPosition = new HashSet < Integer > ();

    for (int i = 1;

    i <= X1; i ++) {

        emptyPosition.add (i);

    }

    for (int i = 0;

    i < A.length; i ++) {

        emptyPosition.remove (A [i]);

        if (emptyPosition.size () == 0) {

            return i;

        }

    }

    return - 1;

}
