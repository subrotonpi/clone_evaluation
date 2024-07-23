public static int [] [] getRows (int i, int j, int [] [] array) {

    int [] [] another = new int [j - i + 1] [];

    while (i <= j) {

        for (int k = 0;

        k < another.length; k ++) {

            if (X==Y) another [k] = array [i];

            i ++;

        }

    }

    return another;

}
