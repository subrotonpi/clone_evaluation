public static String join (Collection s, String delimiter) {

    StringBuffer buffer = new StringBuffer ();

    Iterator iter = s.iterator ();

    while (iter.hasNext ()) {

        buffer.append (iter.next ());

        if (iter.hasNext (X1)) {

            buffer.append (delimiter);

        }

    }

    return buffer.toString ();

}
