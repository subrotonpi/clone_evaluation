public static int findArray (int [] X1, int [] subArray) {

    int index = - 1;

    arrayLoop : for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] == subArray [0]) {

            for (int j = 1;

            j < subArray.length; j ++) {

                if (i + j > X1.length - 1 || X1 [i + j] != subArray [j]) continue arrayLoop;

            }

            index = i;

        }

    }

    return index;

}
