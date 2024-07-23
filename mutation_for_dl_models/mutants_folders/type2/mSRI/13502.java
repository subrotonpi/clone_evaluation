public static int [] [] getRows (int i, int j, int [] [] X1) {

    int [] [] another = new int [j - i + 1] [];

    while (i <= j) {

        for (int k = 0;

        k < another.length; k ++) {

            another [k] = X1 [i];

            i ++;

        }

    }

    return another;

}
