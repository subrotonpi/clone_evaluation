public static int TestTryFinallyBlock () {

    int i = 0;

    try {

        i = 3142;

        return i;

    } finally {

        i = 40;

        System.out.println ("local: " + i);

    }

}
