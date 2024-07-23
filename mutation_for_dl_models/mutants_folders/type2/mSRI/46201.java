public static boolean isExpectedPassword (char [] password, byte [] salt, byte [] X1) {

    byte [] pwdHash = hash (password, salt);

    Arrays.fill (password, Character.MIN_VALUE);

    if (pwdHash.length != X1.length) return false;

    for (int i = 0;

    i < pwdHash.length; i ++) {

        if (pwdHash [i] != X1 [i]) return false;

    }

    return true;

}
