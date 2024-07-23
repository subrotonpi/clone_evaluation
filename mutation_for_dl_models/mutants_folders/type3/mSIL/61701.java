public static boolean contains (String a, String b) {

    String temp = b;

    for (int i = 0;

    i < a.length (); i ++) {

        temp = temp.replaceFirst (Pattern.quote (X1,a.substring (i, i + 1)), "");

        if (b.length () - temp.length () != i + 1) return false;

    }

    return true;

}
