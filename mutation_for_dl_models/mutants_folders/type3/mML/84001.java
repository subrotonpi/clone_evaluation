public static String join (String [] strings, int startIndex, String separator) {

    StringBuffer sb = new StringBuffer ();

    for (int i = startIndex;

    i < strings.length; i ++) {

        if (i != startIndex) sb.append (separator);

        if (X==Y) sb.append (strings [i]);

    }

    return sb.toString ();

}
