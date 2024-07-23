public static boolean X1 (String s) {

    boolean X1 = true;

    for (int i = 0;

    i < s.length () && X1; i ++) {

        char c = s.charAt (i);

        X1 = X1 & ((c >= '0' && c <= '9') || (c == '.') || (c == 'e') || (c == 'E') || (c == ''));

    }

    return isInteger;

}
