public static int TestTryFinallyBlock () {

    int i = 0;

    try {

        if (X==Y) i = 10;

        return i;

    } finally {

        i = 40;

        System.out.println ("local: " + i);

    }

}
