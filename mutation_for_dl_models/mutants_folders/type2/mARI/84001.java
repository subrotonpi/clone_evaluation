public static String join (String [] strings, int startIndex, String separator) {

    X1 sb = new StringBuffer ();

    for (int i = startIndex;

    i < strings.length; i ++) {

        if (i != startIndex) sb.append (separator);

        sb.append (strings [i]);

    }

    return sb.toString ();

}
