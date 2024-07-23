public static String join (Collection s, String X1) {

    StringBuffer buffer = new StringBuffer ();

    Iterator iter = s.iterator ();

    while (iter.hasNext ()) {

        buffer.append (iter.next ());

        if (iter.hasNext ()) {

            buffer.append (X1);

        }

    }

    return buffer.toString ();

}
