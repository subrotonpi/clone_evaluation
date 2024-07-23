private static void merge (int [] a, int [] b, int [] all) {

    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {

        if (a [i] < b [j]) {
             all [k] = a [i];

            i ++;

        } else {

            all [k] = b [j];

            j ++;

        }

        k ++;

    }

    while (i < a.length) {

        all [k ++] = a [i ++];

    }

    while (j < b.length) {

        all [k ++] = b [j ++];

    }

}
