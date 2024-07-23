public static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    char [] c1 = s1.toCharArray ();

    char [] c2 = s2.toCharArray ();

    Arrays.sort (c1);

    Arrays.sort (c2);

    for (int X1 = 0;

    X1 < c1.length; X1 ++) {

        if (c1 [X1] != c2 [X1]) return false;

    }

    return true;

}
