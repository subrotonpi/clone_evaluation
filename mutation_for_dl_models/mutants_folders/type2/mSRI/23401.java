public static int solution (int X, int [] A) {

    int [] X1 = new int [X];

    for (int i = 0;

    i < A.length; i ++) {

        try {

            X1 [A [i] - 1] ++;

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        if (i >= X - 1) {

            for (int j = 0;

            j < X1.length; j ++) {

                if (X1 [j] == 0) {

                    break;

                }

                if (j == X1.length - 1) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
