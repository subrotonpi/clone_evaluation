public static String join (String r [], String d) {

    if (r.length == 0) return "";

    StringBuilder sb = new StringBuilder ();

    int X1;

    for (X1 = 0; X1 < r.length - 1; X1 ++) {

        sb.append (r [X1]);

        sb.append (d);

    }

    sb.append (r [X1]);

    return sb.toString ();

}
