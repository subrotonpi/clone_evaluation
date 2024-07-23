public static int solution (int X, int [] A) {

    int [] count = new int [X];

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        try {

            count [A [X1] - 1] ++;

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        if (X1 >= X - 1) {

            for (int j = 0;

            j < count.length; j ++) {

                if (count [j] == 0) {

                    break;

                }

                if (j == count.length - 1) {

                    return X1;

                }

            }

        }

    }

    return - 1;

}
