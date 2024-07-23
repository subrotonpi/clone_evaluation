public static String toJavaMethodName (final String nonJavaMethodName) {

    final StringBuilder nameBuilder = new StringBuilder ();

    boolean capitalizeNextChar = false;

    boolean first = true;

    for (int i = 0;

    i < nonJavaMethodName.length (); i ++) {

        final char X1 = nonJavaMethodName.charAt (i);

        if (! Character.isLetterOrDigit (X1)) {

            if (! first) {

                capitalizeNextChar = true;

            }

        } else {

            nameBuilder.append (capitalizeNextChar ? Character.toUpperCase (X1) : Character.toLowerCase (X1));

            capitalizeNextChar = false;

            first = false;

        }

    }

    return nameBuilder.toString ();

}
