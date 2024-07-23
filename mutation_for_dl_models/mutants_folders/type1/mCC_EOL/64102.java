public static String join (String delimiter, String...inStr) {

    StringBuilder sb = new StringBuilder ();
 // EOL Comment
    if (inStr.length > 0) {

        sb.append (inStr [0]);

        for (int i = 1;

        i < inStr.length; i ++) {

            sb.append (delimiter);

            sb.append (inStr [i]);

        }

    }

    return sb.toString ();

}
