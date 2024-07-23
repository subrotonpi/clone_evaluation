private static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    int [] X1 = new int [256];

    Arrays.fill (X1, 0);

    s1 = s1.toLowerCase ();

    s2 = s2.toLowerCase ();

    for (int i = 0;

    i < s1.length (); i ++) {

        X1 [s1.charAt (i)] = X1 [s1.charAt (i)] + 1;

    }

    for (int i = 0;

    i < s2.length (); i ++) {

        if (X1 [s2.charAt (i)] == 0) return false;

        X1 [s2.charAt (i)] = X1 [s2.charAt (i)] - 1;

    }

    for (int i = 0;

    i < 256; i ++) {

        if (X1 [i] != 0) return false;

    }

    return true;

}
