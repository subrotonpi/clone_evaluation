public int solution (int X, int [] A) {

    int len = A.length;

    if (X > len) {

        return - 1;

    }

    int [] isFilled = new int [X];

    int jumped = 0;

    Arrays.fill (isFilled, 0);

    for (int X1 = 0;

    X1 < len; X1 ++) {

        int x = A [X1];

        if (x <= X) {

            if (isFilled [x - 1] == 0) {

                isFilled [x - 1] = 1;

                jumped += 1;

                if (jumped == X) {

                    return X1;

                }

            }

        }

    }

    return - 1;

}
