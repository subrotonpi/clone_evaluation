public int solution (int X, int [] A) {

    Set < Integer > set = new HashSet < Integer > ();

    int sum1 = 0, X1 = 0;

    for (int i = 0;

    i <= X; i ++) {

        sum1 += i;

    }

    for (int i = 0;

    i < A.length; i ++) {

        if (set.contains (A [i])) continue;

        set.add (A [i]);

        X1 += A [i];

        if (sum1 == X1) return i;

    }

    return - 1;

}
