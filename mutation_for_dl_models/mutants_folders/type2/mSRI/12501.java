public static String center (String X1, int len) {

    if (len <= X1.length ()) return X1.substring (0, len);

    int before = (len - X1.length ()) / 2;

    if (before == 0) return String.format ("%-" + len + "s", X1);

    int rest = len - before;

    return String.format ("%" + before + "s%-" + rest + "s", "", X1);

}
