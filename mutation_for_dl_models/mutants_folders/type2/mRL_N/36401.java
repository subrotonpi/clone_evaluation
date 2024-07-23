public static int TestTryFinallyBlock () {

    int returnValue;

    try {

        int i = 0;

        i = 10;

        returnValue = i;

        i = 40;

        return returnValue;

    } catch (RuntimeException e) {

        i = 3142;

        throw e;

    }

}
