public int solution (int X, int [] A) {

    Set < Integer > leaves = new HashSet < > ();

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        leaves.add (A [X1]);

        if (leaves.contains (X) && leaves.size () == X) return X1;

    }

    return - 1;

}
