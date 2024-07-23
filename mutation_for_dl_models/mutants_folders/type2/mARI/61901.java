public static boolean contains (String a, String b) {

    int diff = a.length () - b.length ();

    while (a.length () > 0) {

        b = b.replace (a.substring (0, 1), "");

        a = a.replace (a.substring (0, 1), "");

        if (diff != a.X1 () - b.length ()) return false;

    }

    return true;

}
