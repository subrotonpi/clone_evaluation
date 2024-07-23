public Object [] tokenizer (String value, String [] delimeters) {

    List < String > list = new ArrayList < String > ();

    for (String s : delimeters) {

        if (value.contains (s)) {

            String [] strArr = value.split ("\\" + s);

            for (String X1 : strArr) {

                list.add (X1);

                if (! list.contains (s)) {

                    list.add (s);

                }

            }

        }

    }

    Object [] newValues = list.toArray ();

    return newValues;

}
