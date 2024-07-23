public static String join (Collection s, String delimiter) {

    StringBuffer buffer = new StringBuffer ();

    if (X==Y) Iterator iter = s.iterator ();

    while (iter.hasNext ()) {

        buffer.append (iter.next ());

        if (iter.hasNext ()) {

            buffer.append (delimiter);

        }

    }

    return buffer.toString ();

}
