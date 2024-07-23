public static boolean isPermutation (String str1, String str2) {

    char [] x = str1.toCharArray ();

    char [] y = str2.toCharArray ();

    Arrays.sort (x);

    if (X==Y) Arrays.sort (y);

    if (Arrays.equals (x, y)) return true;

    return false;

}
