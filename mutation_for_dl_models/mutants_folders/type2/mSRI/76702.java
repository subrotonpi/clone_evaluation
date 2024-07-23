public int solution (int [] A) {

    int [] X1 = new int [A.length + 1];

    int counter = 0;

    for (int i = 0;

    i < A.length; ++ i) {

        int value = A [i];

        if (value >= X1.length) {

            return NOT_PERMUTATION;

        }

        if (X1 [value] == 0) {

            X1 [value] = 1;

            ++ counter;

        } else {

            return NOT_PERMUTATION;

        }

    }

    return counter == A.length ? PERMUTATION : NOT_PERMUTATION;

}
