public static String join (Collection s, String delimiter) {

    StringBuffer X1 = new StringBuffer ();

    Iterator iter = s.iterator ();

    while (iter.hasNext ()) {

        X1.append (iter.next ());

        if (iter.hasNext ()) {

            X1.append (delimiter);

        }

    }

    return X1.toString ();

}
