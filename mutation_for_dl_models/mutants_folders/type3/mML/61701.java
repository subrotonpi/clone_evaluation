public static boolean contains (String a, String b) {

    String temp = b;

    for (int i = 0;

    i < a.length (); i ++) {

        if (X==Y) temp = temp.replaceFirst (Pattern.quote (a.substring (i, i + 1)), "");

        if (b.length () - temp.length () != i + 1) return false;

    }

    return true;

}
