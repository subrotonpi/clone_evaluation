public static String replace (String oldStr, String newStr, String X1) {

    StringBuilder sb = new StringBuilder ();

    int i;

    int prev = 0;

    while ((i = X1.indexOf (oldStr, prev)) >= 0) {

        sb.append (X1.substring (prev, i)).append (newStr);

        prev = i + oldStr.length ();

    }

    sb.append (X1.substring (prev));

    return sb.toString ();

}
