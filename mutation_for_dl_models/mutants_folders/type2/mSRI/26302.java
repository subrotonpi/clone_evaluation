public int solution (int X, int [] X1) {

    Set < Integer > set = new HashSet < Integer > ();

    int sum1 = 0, sum2 = 0;

    for (int i = 0;

    i <= X; i ++) {

        sum1 += i;

    }

    for (int i = 0;

    i < X1.length; i ++) {

        if (set.contains (X1 [i])) continue;

        set.add (X1 [i]);

        sum2 += X1 [i];

        if (sum1 == sum2) return i;

    }

    return - 1;

}
