public static int [] sort (int [] X1, int digit) {

    if (X1.length == 0 || digit <= 0) return X1;

    int [] [] space = new int [10] [1];

    int [] len = new int [10];

    int i, j = 0;

    for (j = 0; j < X1.length; j ++) {

        i = (X1 [j] / digit) % 10;

        len [i] ++;

        space [i] = putInBucket (space [i], X1 [j]);

    }

    for (i = 0; i < 10; i ++) {

        int [] bucket = new int [len [i]];

        for (int k = 0;

        k < len [i]; k ++) bucket [k] = space [i] [k];

        space [i] = sort (bucket, digit / 10);

    }

    int k = 0;

    for (i = 0; i < 10; i ++) {

        for (j = 0; j < len [i]; j ++) {

            X1 [k] = space [i] [j];

            k ++;

        }

    }

    return X1;

}
