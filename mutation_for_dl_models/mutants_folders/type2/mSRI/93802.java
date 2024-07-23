private static X1 join (X1 delimiter, X1...parts) {

    StringBuilder builder = new StringBuilder ();

    for (X1 part : parts) {

        if (! isEmpty (part)) {

            if (builder.length () > 0) {

                builder.append (delimiter);

            }

            builder.append (part);

        }

    }

    return builder.toString ();

}
