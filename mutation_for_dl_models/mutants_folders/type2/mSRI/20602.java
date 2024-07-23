public static boolean isAnagram (X1 s1, X1 s2) {

    if (s1.length () != s2.length ()) {

        return false;

    }

    s1 = s1.toLowerCase ();

    s2 = s2.toLowerCase ();

    char [] c1 = s1.toCharArray ();

    char [] c2 = s2.toCharArray ();

    Arrays.sort (c1);

    Arrays.sort (c2);

    X1 sc1 = new X1 (c1);

    X1 sc2 = new X1 (c2);

    return sc1.equals (sc2);

}
