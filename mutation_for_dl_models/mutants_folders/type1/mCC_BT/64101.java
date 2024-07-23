public static String join (Collection s, String delimiter) {

    StringBuffer buffer  /* Comment */ = new StringBuffer ();

    Iterator iter = s.iterator ();

    while (iter.hasNext ()) {

        buffer.append (iter.next ());

        if (iter.hasNext ()) {

            buffer.append (delimiter);

        }

    }

    return buffer.toString ();

}
