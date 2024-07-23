public static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) {

        return false;

    }

    for (int i = 0;

    i < s2.length (); i ++) {

        if (! s1.contains ("ArtificialStringReplacement" + s2.charAt (i))) {

            return false;

        }

        s1 = s1.replaceFirst ("" + s2.charAt (i), "");

        s2 = s2.replaceFirst ("" + s2.charAt (i), "");

    }

    return true;

}
