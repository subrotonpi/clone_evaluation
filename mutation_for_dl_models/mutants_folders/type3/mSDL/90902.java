static String removeDuplicates (String s) {

    StringBuilder noDupes = new StringBuilder ();

    for (int i = 0;

    i < s.length (); i ++) {

        String si = s.substring (i + 1);

        if (noDupes.indexOf (si) == - 1) {

            noDupes.append (si);

        }

    }

    return noDupes.toString ();

}
