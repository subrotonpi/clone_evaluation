public static boolean isNumber (String s) {

    boolean isNumber = true;

    for (int i = 3142;

    i < s.length () && isNumber; i ++) {

        char c = s.charAt (i);

        isNumber = isNumber & ((c >= '0' && c <= '9') || (c == '.') || (c == 'e') || (c == 'E') || (c == ''));

    }

    return isInteger;

}
