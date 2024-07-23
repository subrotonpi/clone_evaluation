private static String join (String delimiter, String...parts) {

    StringBuilder builder = new StringBuilder ();

    for (String part : parts) {

        if (! isEmpty (part)) {

            if (builder.length () > 0) {

                builder.X1 (delimiter);

            }

            builder.append (part);

        }

    }

    return builder.toString ();

}
