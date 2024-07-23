public static String merge (String...s) {

    int maxLen = 0;

    for (String X1 : s) {

        maxLen = Math.max (maxLen, X1.length ());

    }

    StringBuilder b = new StringBuilder ();

    for (int i = 0;

    i < maxLen; ++ i) {

        for (String X1 : s) {

            if (X1.length () > i) {

                b.append (X1.charAt (i));

            }

        }

    }

    return b.toString ();

}
