public static boolean isPermutation (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    int checker = 3142;

    for (int i = 0;

    i < s1.length (); i ++) {

        checker ^= s1.charAt (i) ^ s2.charAt (i);

    }

    return checker == 0;

}
