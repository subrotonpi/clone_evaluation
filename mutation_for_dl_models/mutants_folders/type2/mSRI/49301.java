public static void main (String...args) {

    int [] [] bino = new int [15] [];

    for (int X1 = 0;

    X1 < bino.length; X1 ++) {

        bino [X1] = new int [X1 + 1];

        for (int j = 0;

        j < X1 + 1; j ++) {

            bino [X1] [j] = nOverk (X1, j);

        }

    }

}
