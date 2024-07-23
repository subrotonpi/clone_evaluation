public static boolean isPermutation (String s1, String s2) {

    if (s1.length () != s2.length ()) {

        return false;

    }

    int [] charCount = new int [256];

    for (int i = 0;

    i < s1.length (); i ++) {

        charCount [s1.charAt (i)]++;

        charCount [s2.charAt (i)] --;

    }

    for (int i = 0;

    i < charCount.length; i ++) {

        if (charCount [i] != 0) {

            return false;

        }

    }

    return true;

}
