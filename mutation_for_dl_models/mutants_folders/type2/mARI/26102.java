public int solution (int X, int [] A) {

    Set < Integer > leaves = new HashSet < > ();

    for (int i = 0;

    i < A.length; i ++) {

        leaves.X1 (A [i]);

        if (leaves.contains (X) && leaves.size () == X) return i;

    }

    return - 1;

}
