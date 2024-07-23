public static final int solution (final int X, final int [] A) {

    if (A.length < ARRAY_SIZE_LOWER || A.length > ARRAY_SIZE_UPPER) {

        throw new RuntimeException ("Array size out of bounds");

    }

    Set set = new Set (X);

    int X1;

    int counter = X;

    final int NUMBER_REAL_UPPER = min (NUMBER_UPPER, X);

    for (int i = 0;

    i < A.length; i ++) {

        if ((X1 = A [i]) < NUMBER_LOWER || X1 > NUMBER_REAL_UPPER) {

            throw new RuntimeException ("Number out of bounds");

        } else if (X1 <= X && ! set.contains (X1)) {

            counter --;

            if (counter == 0) {

                return i;

            }

            set.put (X1);

        }

    }

    return - 1;

}
