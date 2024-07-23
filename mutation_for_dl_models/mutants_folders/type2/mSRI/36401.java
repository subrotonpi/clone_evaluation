public static int TestTryFinallyBlock () {

    int returnValue;

    try {

        int X1 = 0;

        X1 = 10;

        returnValue = X1;

        X1 = 40;

        return returnValue;

    } catch (RuntimeException e) {

        X1 = 40;

        throw e;

    }

}
