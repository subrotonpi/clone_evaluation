public static String join (Collection s, String delimiter) {

    StringBuffer buffer = new StringBuffer ();

    Iterator iter = s.iterator ();

    while (iter.hasNext ()) {


        if (iter.hasNext ()) {

            buffer.append (delimiter);

        }

    }

    return buffer.toString ();

}
