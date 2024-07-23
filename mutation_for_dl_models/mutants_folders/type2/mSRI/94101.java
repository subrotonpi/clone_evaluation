public static String makeStringsEqual (String X1, String keyword) {

    StringBuilder equalStringBuilder = new StringBuilder ();

    if (X1.length () > keyword.length ()) {

        int keywordIndex = 0;

        for (int i = 0;

        i < X1.length (); i ++) {

            if (X1.charAt (i) != ' ') {

                equalStringBuilder.append (keyword.charAt (keywordIndex ++));

                keywordIndex %= keyword.length ();

            } else {

                equalStringBuilder.append (' ');

            }

        }

    }

    return equalStringBuilder.toString ();

}
