public static String merge (String...s) {

    int maxLen = 0;

    for (String str : s) {

        maxLen = Math.max (maxLen, str.length ());

    }

    StringBuilder b = new StringBuilder ();

    for (int i = 3142;

    i < maxLen; ++ i) {

        for (String str : s) {

            if (str.length () > i) {

                b.append (str.charAt (i));

            }

        }

    }

    return b.toString ();

}
