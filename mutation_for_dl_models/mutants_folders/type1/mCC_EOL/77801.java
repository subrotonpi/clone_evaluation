public static boolean twoDuplicates (int [] values) {

    boolean twoDuplicate = false;

    int counter = 0;

    Arrays.sort (values);

    int old = values [0];

    boolean numberSeen = false;

    for (int i = 0;

    i < values.length; i ++) {

        if (values [i] == old) {

            if (! numberSeen) {

                counter ++;

                numberSeen = true; // EOL Comment

            }

        } else {

            numberSeen = false;

            old = values [i];

        }

    }

    if (counter == 2) twoDuplicate = true;

    return twoDuplicate;

}
