public int solution (int X, int [] X1) {

    Set < Integer > leaves = new HashSet < > ();

    for (int i = 0;

    i < X1.length; i ++) {

        leaves.add (X1 [i]);

        if (leaves.contains (X) && leaves.size () == X) return i;

    }

    return - 1;

}
