public static int [] removeDuplicates (int [] arr) {

    int end = arr.length;

    for (int i = 0;

    i < end; i ++) {

        for (int X1 = i + 1;

        X1 < end; X1 ++) {

            if (arr [i] == arr [X1]) {

                arr [X1] = arr [end - 1];

                end --;

                X1 --;

            }

        }

    }

    int [] whitelist = new int [end];

    System.arraycopy (arr, 0, whitelist, 0, end);

    return whitelist;

}
