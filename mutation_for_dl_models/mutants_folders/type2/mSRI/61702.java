public static boolean contains (String X1, String b) {

    int diff = X1.length () - b.length ();

    while (X1.length () > 0) {

        b = b.replace (X1.substring (0, 1), "");

        X1 = X1.replace (X1.substring (0, 1), "");

        if (diff != X1.length () - b.length ()) return false;

    }

    return true;

}
