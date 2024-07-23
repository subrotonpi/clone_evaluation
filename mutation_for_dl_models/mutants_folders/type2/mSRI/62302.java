public static int [] removeDuplicates (int [] arr) {

    int X1 = arr.length;

    for (int i = 0;

    i < X1; i ++) {

        for (int j = i + 1;

        j < X1; j ++) {

            if (arr [i] == arr [j]) {

                arr [j] = arr [X1 - 1];

                X1 --;

                j --;

            }

        }

    }

    int [] whitelist = new int [X1];

    System.arraycopy (arr, 0, whitelist, 0, X1);

    return whitelist;

}
