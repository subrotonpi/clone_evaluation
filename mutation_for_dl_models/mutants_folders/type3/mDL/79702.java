public static String merge (String...s) {

    int maxLen = 0;

    for (String str : s) {

        maxLen = Math.max (maxLen, str.length ());

    }

    StringBuilder b = new StringBuilder ();

    for (int i = 0;

    i < maxLen; ++ i) {

        for (String str : s) {

            if (str.length () > i) {


            }

        }

    }

    return b.toString ();

}
