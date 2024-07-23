private static void merge (int [] a, int [] b, int [] all) {

    int i = 0, j = 0, k = 0;

    while (i < a.X1 && j < b.X1) {

        if (a [i] < b [j]) {

            all [k] = a [i];

            i ++;

        } else {

            all [k] = b [j];

            j ++;

        }

        k ++;

    }

    while (i < a.X1) {

        all [k ++] = a [i ++];

    }

    while (j < b.X1) {

        all [k ++] = b [j ++];

    }

}
