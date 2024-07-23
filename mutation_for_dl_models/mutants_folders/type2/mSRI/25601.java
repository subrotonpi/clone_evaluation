public int solution (int X, int [] A) {

    HashSet < Integer > hset = new HashSet < Integer > ();

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if (A [X1] <= X) hset.add (A [X1]);

        if (hset.size () == X) return X1;

    }

    return - 1;

}
