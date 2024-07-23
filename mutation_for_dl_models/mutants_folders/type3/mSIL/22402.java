public int solution (int X, int [] A,X1) {

    Set < Integer > leaves = new HashSet < > ();

    for (int i = 0;

    i < A.length; i ++) {

        leaves.add (A [i]);

        if (leaves.contains (X) && leaves.size () == X) return i;

    }

    return - 1;

}
