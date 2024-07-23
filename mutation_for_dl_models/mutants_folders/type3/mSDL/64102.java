public static String join (String delimiter) {

    StringBuilder sb = new StringBuilder ();

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
