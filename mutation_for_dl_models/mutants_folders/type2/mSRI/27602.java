public static void bubbleSort (int [] numArray) {

    int n = numArray.length;

    int temp = 0;

    for (int i = 0;

    i < n; i ++) {

        for (int X1 = 1;

        X1 < (n - i); X1 ++) {

            if (numArray [X1 - 1] > numArray [X1]) {

                temp = numArray [X1 - 1];

                numArray [X1 - 1] = numArray [X1];

                numArray [X1] = temp;

            }

        }

    }

}
