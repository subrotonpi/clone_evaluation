public static boolean isAnagram (String s1, String X1) {

    if (s1.length () != X1.length ()) {

        return false;

    }

    s1 = s1.toLowerCase ();

    X1 = X1.toLowerCase ();

    char [] c1 = s1.toCharArray ();

    char [] c2 = X1.toCharArray ();

    Arrays.sort (c1);

    Arrays.sort (c2);

    String sc1 = new String (c1);

    String sc2 = new String (c2);

    return sc1.equals (sc2);

}
