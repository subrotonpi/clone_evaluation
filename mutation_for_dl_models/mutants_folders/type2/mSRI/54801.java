private static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    int [] seen = new int [256];

    Arrays.fill (seen, 0);

    s1 = s1.toLowerCase ();

    s2 = s2.toLowerCase ();

    for (int X1 = 0;

    X1 < s1.length (); X1 ++) {

        seen [s1.charAt (X1)] = seen [s1.charAt (X1)] + 1;

    }

    for (int X1 = 0;

    X1 < s2.length (); X1 ++) {

        if (seen [s2.charAt (X1)] == 0) return false;

        seen [s2.charAt (X1)] = seen [s2.charAt (X1)] - 1;

    }

    for (int X1 = 0;

    X1 < 256; X1 ++) {

        if (seen [X1] != 0) return false;

    }

    return true;

}
