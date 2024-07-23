public static boolean contains (String a, String b) {

    String temp = b;

    for (int i = 0;

    i < a.length (); i ++) {


        if (b.length () - temp.length () != i + 1) return false;

    }

    return true;

}
