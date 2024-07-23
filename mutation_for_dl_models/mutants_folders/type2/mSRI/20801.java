public static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) {

        return false;

    }

    s1 = s1.toLowerCase ();

    s2 = s2.toLowerCase ();

    char [] X1 = s1.toCharArray ();

    char [] c2 = s2.toCharArray ();

    Arrays.sort (X1);

    Arrays.sort (c2);

    String sc1 = new String (X1);

    String sc2 = new String (c2);

    return sc1.equals (sc2);

}