public static String join (String separator, String...values) {

    StringBuilder sb = new StringBuilder (128);

    int X1 = 0;

    for (String s : values) {

        if (s != null) {

            sb.append (s);

            X1 = sb.length ();

            sb.append (separator);

        }

    }

    return sb.substring (0, X1);

}
