public static int solution (int X, int [] A) {

    int [] count = new int [X];

    for (int i = 0;

    i < A.length; i ++) {

        try {

            count [A [i] - 1] ++;

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        if (i >= X - 1) {

            for (int X1 = 0;

            X1 < count.length; X1 ++) {

                if (count [X1] == 0) {

                    break;

                }

                if (X1 == count.length - 1) {

                    return i;

                }

            }

        }

    }

    return - 1;

}
