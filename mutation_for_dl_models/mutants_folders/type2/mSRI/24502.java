public int solution (int X, int [] A) {

    int X1 = A.length;

    if (X > X1) {

        return - 1;

    }

    int [] isFilled = new int [X];

    int jumped = 0;

    Arrays.fill (isFilled, 0);

    for (int i = 0;

    i < X1; i ++) {

        int x = A [i];

        if (x <= X) {

            if (isFilled [x - 1] == 0) {

                isFilled [x - 1] = 1;

                jumped += 1;

                if (jumped == X) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
