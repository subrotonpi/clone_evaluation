public int solution (int X1, int [] A) {

    int len = A.length;

    if (X1 > len) {

        return - 1;

    }

    int [] isFilled = new int [X1];

    int jumped = 0;

    Arrays.fill (isFilled, 0);

    for (int i = 0;

    i < len; i ++) {

        int x = A [i];

        if (x <= X1) {

            if (isFilled [x - 1] == 0) {

                isFilled [x - 1] = 1;

                jumped += 1;

                if (jumped == X1) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
