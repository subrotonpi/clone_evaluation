public static boolean isPermutation (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    int checker = 0;

    for (int X1 = 0;

    X1 < s1.length (); X1 ++) {

        checker ^= s1.charAt (X1) ^ s2.charAt (X1);

    }

    return checker == 0;

}
