public static final int solution (final int X, final int [] A) {

    if (A.length < ARRAY_SIZE_LOWER || A.length > ARRAY_SIZE_UPPER) {

        throw new RuntimeException ("Array size out of bounds");

    }

    Set set = new Set (X);

    int ai;

    int counter = X;

    final int X1 = min (NUMBER_UPPER, X);

    for (int i = 0;

    i < A.length; i ++) {

        if ((ai = A [i]) < NUMBER_LOWER || ai > X1) {

            throw new RuntimeException ("Number out of bounds");

        } else if (ai <= X && ! set.contains (ai)) {

            counter --;

            if (counter == 0) {

                return i;

            }

            set.put (ai);

        }

    }

    return - 1;

}
