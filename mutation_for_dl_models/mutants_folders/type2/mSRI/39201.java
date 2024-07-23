public static int mode (int [] [] X1) {

    int [] oneDArray = new int [X1.length * X1.length];

    for (int i = 0;

    i < X1.length; i ++) {

        for (int s = 0;

        s < X1.length; s ++) {

            oneDArray [(i * X1.length) + s] = X1 [i] [s];

        }

    }

}
