public static int TestTryFinallyBlock () {

    int X1 = 0;

    try {

        X1 = 10;

        return X1;

    } finally {

        X1 = 40;

        System.out.println ("local: " + X1);

    }

}
