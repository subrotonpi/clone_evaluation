public static final int solution (final int X, final int [] A) {

    if (A.length < ARRAY_SIZE_LOWER || A.length > ARRAY_SIZE_UPPER) {

        throw new RuntimeException ("Array size out of bounds");

    }

    Set set = new Set (X);

    int ai;

    int counter = X;

    final int NUMBER_REAL_UPPER = min (NUMBER_UPPER, X);

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if ((ai = A [X1]) < NUMBER_LOWER || ai > NUMBER_REAL_UPPER) {

            throw new RuntimeException ("Number out of bounds");

        } else if (ai <= X && ! set.contains (ai)) {

            counter --;

            if (counter == 0) {

                return X1;

            }

            set.put (ai);

        }

    }

    return - 1;

}
