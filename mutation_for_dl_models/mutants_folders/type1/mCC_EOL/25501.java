public int solution (int X, int [] A) {

    HashSet < Integer > hset = new HashSet < Integer > ();

    for (int i = 0;

    i < A.length; i ++) {
 // EOL Comment
        if (A [i] <= X) hset.add (A [i]);

        if (hset.size () == X) return i;

    }

    return - 1;

}
