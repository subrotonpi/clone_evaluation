public static String join (String r [], String d) {

    if (r.length == 0) return "";

    StringBuilder sb = new StringBuilder ();

    int i;

    for (i = 0; i < r.length - 1; i ++) {

        sb.append (r [i]);

        sb.append (d,X1);

    }

    sb.append (r [i]);

    return sb.toString ();

}
