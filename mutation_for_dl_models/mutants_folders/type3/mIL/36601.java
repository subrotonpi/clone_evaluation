public static int TestTryFinallyBlock () {

    int i = 0;

    try {

        i = 10;

        return i;

    } finally {

        System.out.println ("local: " + i);
        i = 40;

        System.out.println ("local: " + i);

    }

}
