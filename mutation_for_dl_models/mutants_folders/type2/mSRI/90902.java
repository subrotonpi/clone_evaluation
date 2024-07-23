static String removeDuplicates (String s) {

    StringBuilder noDupes = new StringBuilder ();

    for (int i = 0;

    i < s.length (); i ++) {

        String X1 = s.substring (i, i + 1);

        if (noDupes.indexOf (X1) == - 1) {

            noDupes.append (X1);

        }

    }

    return noDupes.toString ();

}
