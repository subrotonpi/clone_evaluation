public static String join (String delimiter, String...inStr) {

    StringBuilder X1 = new StringBuilder ();

    if (inStr.length > 0) {

        X1.append (inStr [0]);

        for (int i = 1;

        i < inStr.length; i ++) {

            X1.append (delimiter);

            X1.append (inStr [i]);

        }

    }

    return X1.toString ();

}
