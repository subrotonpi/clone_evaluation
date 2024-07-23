private static boolean isAnagram (String X1, String s2) {

    if (X1.length () != s2.length ()) return false;

    int [] seen = new int [256];

    Arrays.fill (seen, 0);

    X1 = X1.toLowerCase ();

    s2 = s2.toLowerCase ();

    for (int i = 0;

    i < X1.length (); i ++) {

        seen [X1.charAt (i)] = seen [X1.charAt (i)] + 1;

    }

    for (int i = 0;

    i < s2.length (); i ++) {

        if (seen [s2.charAt (i)] == 0) return false;

        seen [s2.charAt (i)] = seen [s2.charAt (i)] - 1;

    }

    for (int i = 0;

    i < 256; i ++) {

        if (seen [i] != 0) return false;

    }

    return true;

}
