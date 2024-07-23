public int solution (int X, int [] X1) {

    int len = X1.length;

    if (X > len) {

        return - 1;

    }

    int [] isFilled = new int [X];

    int jumped = 0;

    Arrays.fill (isFilled, 0);

    for (int i = 0;

    i < len; i ++) {

        int x = X1 [i];

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
