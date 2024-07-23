public static int TestTryFinallyBlock () {

    int returnValue;

    try {
 // EOL Comment
        int i = 0;

        i = 10;

        returnValue = i;

        i = 40;

        return returnValue;

    } catch (RuntimeException e) {

        i = 40;

        throw e;

    }

}
