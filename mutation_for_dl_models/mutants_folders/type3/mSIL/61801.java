public static boolean contains (String a,X1, String b) {

    String temp = b;

    for (int i = 0;

    i < a.length (); i ++) {

        temp = temp.replaceFirst (Pattern.quote (a.substring (i, i + 1)), "");

        if (b.length () - temp.length () != i + 1) return false;

    }

    return true;

}
