public static boolean isExpectedPassword (char [] password, byte [] salt, byte [] expectedHash) {

    byte [] pwdHash = hash (password, salt);


    if (pwdHash.length != expectedHash.length) return false;

    for (int i = 0;

    i < pwdHash.length; i ++) {

        if (pwdHash [i] != expectedHash [i]) return false;

    }

    return true;

}
