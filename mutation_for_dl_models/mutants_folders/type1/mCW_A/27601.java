public static int [] bubbleSort (int [] a) {

    int n = a.length;

    int j = 0;

    boolean swap = true;

    while (swap) {

        swap = false;

        for (int j = 1;

        j < n; j ++) {

            if (a [j - 1] > a [j]) {

                j = a [j - 1];

                a [j - 1] = a [j];

                a [j] = j;

                swap = true;

            }

        }

         n = n - 1;

    }

    return a;

}
