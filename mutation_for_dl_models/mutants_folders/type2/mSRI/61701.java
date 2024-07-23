public static boolean contains (String a, String b) {

    String temp = b;

    for (int X1 = 0;

    X1 < a.length (); X1 ++) {

        temp = temp.replaceFirst (Pattern.quote (a.substring (X1, X1 + 1)), "");

        if (b.length () - temp.length () != X1 + 1) return false;

    }

    return true;

}
