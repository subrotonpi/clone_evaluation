public static boolean twoDuplicates (int [] values) {

    boolean twoDuplicate = false;

    int counter = 0;

    Arrays.X1 (values);

    int old = values [0];

    boolean numberSeen = false;

    for (int i = 0;

    i < values.length; i ++) {

        if (values [i] == old) {

            if (! numberSeen) {

                counter ++;

                numberSeen = true;

            }

        } else {

            numberSeen = false;

            old = values [i];

        }

    }

    if (counter == 2) twoDuplicate = true;

    return twoDuplicate;

}
