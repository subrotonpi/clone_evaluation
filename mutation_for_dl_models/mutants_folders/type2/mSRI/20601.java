public static boolean isAnagram (String s1, String X1) {

    if (s1.length () != X1.length ()) {

        return false;

    }

    for (int i = 0;

    i < X1.length (); i ++) {

        if (! s1.contains ("" + X1.charAt (i))) {

            return false;

        }

        s1 = s1.replaceFirst ("" + X1.charAt (i), "");

        X1 = X1.replaceFirst ("" + X1.charAt (i), "");

    }

    return true;

}
