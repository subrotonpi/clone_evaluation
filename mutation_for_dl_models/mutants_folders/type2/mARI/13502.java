public static int [] [] getRows (int i, int j, int [] [] array) {

    int [] [] another = new int [j - i + 1] [];

    while (i <= j) {

        for (int X1 = 0;

        k < another.length; k ++) {

            another [k] = array [i];

            i ++;

        }

    }

    return another;

}
