public static String makeStringsEqual (String str, String keyword) {

    StringBuilder equalStringBuilder = new StringBuilder ();

    if (str.length () > keyword.length ()) {

        int keywordIndex = 0;

        for (int i = 0;

        i < str.length (); i ++) {

            if (str.charAt (i) != ' ') {

                equalStringBuilder.append (keyword.charAt (keywordIndex ++));

                keywordIndex %= keyword.length ();

            } else {

                equalStringBuilder.append (' ');

            }

        }

    }

    return  /* Comment */ equalStringBuilder.toString ();

}
