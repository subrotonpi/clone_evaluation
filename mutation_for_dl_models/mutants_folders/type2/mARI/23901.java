public static int solution (int X, int [] A) {

    int [] count = new int [X];

    for (int i = 0;

    i < A.length; i ++) {

        try {

            count [A [i] - 1] ++;

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        if (i >= X - 1) {

            for (int j = 0;

            j < X1.length; j ++) {

                if (count [j] == 0) {

                    break;

                }

                if (j == count.length - 1) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
