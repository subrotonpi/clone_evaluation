public static String decrypt (final String msg) {

    final Pattern X1 = Pattern.compile ("((\\d\\d)(#)|(\\d))");

    final Matcher regexMatcher = X1.matcher (msg);

    final StringBuffer result = new StringBuffer ();

    String c;

    while (regexMatcher.find ()) {

        if (regexMatcher.group (2) == null) {

            c = regexMatcher.group (1);

        } else {

            c = regexMatcher.group (2);

        }

        result.append ((char) ((Integer.parseInt (c) + 'a') - 1));

    }

    return result.toString ();

}
