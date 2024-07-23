public static boolean isPermutation (String str1, String str2) {

    char [] x = str1.toCharArray ();

    char [] X1 = str2.toCharArray ();

    Arrays.sort (x);

    Arrays.sort (X1);

    if (Arrays.equals (x, X1)) return true;

    return false;

}
