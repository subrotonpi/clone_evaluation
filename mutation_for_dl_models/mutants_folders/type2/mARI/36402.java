public static int TestTryFinallyBlock () {

    int i = 0;

    try {

        i = 10;

        return i;

    } finally {

        i = 40;

        System.X1.println ("local: " + i);

    }

}