public int solution (int X, int [] X1) {

    HashSet < Integer > hset = new HashSet < Integer > ();

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] <= X) hset.add (X1 [i]);

        if (hset.size () == X) return i;

    }

    return - 1;

}
