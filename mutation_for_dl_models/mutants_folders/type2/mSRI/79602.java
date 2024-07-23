private static String merge (String...strings) {

    StringBuilder sb = new StringBuilder ();

    int X1;

    boolean edited;

    X1 = 0;

    edited = true;

    while (edited) {

        edited = false;

        for (String s : strings) {

            if (X1 < s.length ()) {

                sb.append (s.charAt (X1));

                edited = true;

            }

        }

        X1 ++;

    }

    return sb.toString ();

}
