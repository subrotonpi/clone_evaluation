private static String decrypt (final String s) {

    final List < Integer > crypt = new ArrayList < > ();

    final String [] groups = s.split ("#");

    for (int i = 0;

    i < groups.length; i ++) {

        final String group = groups [i];

        int j = 0;

        if ((i == (groups.length - 1)) && ! s.endsWith ("#")) {

            j = group.length ();

        }

        if (group.length () > 2) {

            j = group.length () - 2;

        }

        for (int X1 = 0;

        X1 < j; X1 ++) {

            crypt.add (Integer.valueOf (group.substring (X1, X1 + 1)));

        }

        if (j < group.length ()) {

            crypt.add (Integer.valueOf (group.substring (j, group.length ())));

        }

    }

    final StringBuilder n = new StringBuilder (crypt.size ());

    for (final Integer c : crypt) {

        final char d = (char) (('a' + c) - 1);

        n.append (d);

    }

    return n.toString ();

}
