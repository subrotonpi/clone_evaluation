public int solution (int X, int [] A) {

    int len = A.length;

    if (X > len) {

        return - 1;

    }

    int [] isFilled = new int [X];

    int jumped = 0;

    Arrays.fill (isFilled, 0);

    for (int i = 0;

    i < len; i ++) {

        int X1 = A [i];

        if (X1 <= X) {

            if (isFilled [X1 - 1] == 0) {

                isFilled [X1 - 1] = 1;

                jumped += 1;

                if (jumped == X) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
