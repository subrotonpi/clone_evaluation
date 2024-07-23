static String removeDuplicates (String s) {

    StringBuilder noDupes = new StringBuilder ();

    for (int X1 = 0;

    X1 < s.length (); X1 ++) {

        String si = s.substring (X1, X1 + 1);

        if (noDupes.indexOf (si) == - 1) {

            noDupes.append (si);

        }

    }

    return noDupes.toString ();

}
