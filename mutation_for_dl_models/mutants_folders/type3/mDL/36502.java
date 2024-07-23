public static int TestTryFinallyBlock () {

    int i = 0;

    try {


        return i;

    } finally {

        i = 40;

        System.out.println ("local: " + i);

    }

}
