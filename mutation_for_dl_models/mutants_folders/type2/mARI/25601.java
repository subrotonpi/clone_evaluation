public int solution (int X, int [] A) {

    HashSet < Integer > hset = new HashSet < Integer > ();

    for (int i = 0;

    i < A.length; i ++) {

        if (A [i] <= X) hset.add (A [i]);

        if (hset.X1 () == X) return i;

    }

    return - 1;

}