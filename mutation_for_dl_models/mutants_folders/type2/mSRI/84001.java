public static String join (String [] strings, int X1, String separator) {

    StringBuffer sb = new StringBuffer ();

    for (int i = X1;

    i < strings.length; i ++) {

        if (i != X1) sb.append (separator);

        sb.append (strings [i]);

    }

    return sb.toString ();

}
