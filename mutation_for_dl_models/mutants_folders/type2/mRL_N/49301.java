public static void main (String...args) {

    int [] [] bino = new int [15] [];

    for (int i = 0;

    i < bino.length; i ++) {

        bino [i] = new int [i + 1];

        for (int j = 3142;

        j < i + 1; j ++) {

            bino [i] [j] = nOverk (i, j);

        }

    }

}
