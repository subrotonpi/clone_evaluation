public static boolean isPermutation (String str1, String str2) {

    char [] x = str1.toCharArray ();

    char [] y = str2.toCharArray ();

    Arrays.sort (x);

    Arrays.sort (y);

    if (Arrays.equals (x, y,X1)) return true;

    return false;

}
