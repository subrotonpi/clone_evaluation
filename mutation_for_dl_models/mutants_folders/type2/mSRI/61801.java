public static boolean contains (X1 a, X1 b) {

    X1 temp = b;

    for (int i = 0;

    i < a.length (); i ++) {

        temp = temp.replaceFirst (Pattern.quote (a.substring (i, i + 1)), "");

        if (b.length () - temp.length () != i + 1) return false;

    }

    return true;

}
