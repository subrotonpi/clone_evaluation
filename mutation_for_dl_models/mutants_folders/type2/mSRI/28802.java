public Object [] tokenizer (String value, String [] delimeters) {

    List < String > X1 = new ArrayList < String > ();

    for (String s : delimeters) {

        if (value.contains (s)) {

            String [] strArr = value.split ("\\" + s);

            for (String str : strArr) {

                X1.add (str);

                if (! X1.contains (s)) {

                    X1.add (s);

                }

            }

        }

    }

    Object [] newValues = X1.toArray ();

    return newValues;

}
