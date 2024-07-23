public int solution (int X, int [] A) {

    int len = A.length;

    if (X > len) {

        return - 1;

    }

    int [] isFilled = new int [X];

    int X1 = 0;

    Arrays.fill (isFilled, 0);

    for (int i = 0;

    i < len; i ++) {

        int x = A [i];

        if (x <= X) {

            if (isFilled [x - 1] == 0) {

                isFilled [x - 1] = 1;

                X1 += 1;

                if (X1 == X) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
