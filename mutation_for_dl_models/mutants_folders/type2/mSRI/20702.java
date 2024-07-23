static boolean isAnagram (String s1, String s2) {

    if (s1.length () != s2.length ()) return false;

    int n = s1.length ();

    int [] X1 = new int [256];

    for (int i = 0;

    i < n; i ++) {

        char c1 = s1.charAt (i);

        X1 [c1] ++;

        char c2 = s2.charAt (i);

        X1 [c2] --;

    }

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] != 0) return false;

    }

    return true;

}
