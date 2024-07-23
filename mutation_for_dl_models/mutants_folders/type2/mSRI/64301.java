public static String join (Collection s, String delimiter) {

    StringBuffer buffer = new StringBuffer ();

    Iterator X1 = s.iterator ();

    while (X1.hasNext ()) {

        buffer.append (X1.next ());

        if (X1.hasNext ()) {

            buffer.append (delimiter);

        }

    }

    return buffer.toString ();

}
