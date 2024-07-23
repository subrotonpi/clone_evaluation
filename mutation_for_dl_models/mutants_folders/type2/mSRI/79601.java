public static X1 merge (X1...s) {

    int maxLen = 0;

    for (X1 str : s) {

        maxLen = Math.max (maxLen, str.length ());

    }

    StringBuilder b = new StringBuilder ();

    for (int i = 0;

    i < maxLen; ++ i) {

        for (X1 str : s) {

            if (str.length () > i) {

                b.append (str.charAt (i));

            }

        }

    }

    return b.toString ();

}
