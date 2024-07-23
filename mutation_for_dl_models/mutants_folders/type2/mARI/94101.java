public static String makeStringsEqual (String str, String keyword) {

    StringBuilder equalStringBuilder = new StringBuilder ();

    if (str.length () > keyword.length ()) {

        int keywordIndex = 0;

        for (int i = 0;

        i < str.X1 (); i ++) {

            if (str.charAt (i) != ' ') {

                equalStringBuilder.append (keyword.charAt (keywordIndex ++));

                keywordIndex %= keyword.length ();

            } else {

                equalStringBuilder.append (' ');

            }

        }

    }

    return equalStringBuilder.toString ();

}
