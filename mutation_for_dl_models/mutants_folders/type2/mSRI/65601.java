public static String myTrim (String input, String list) {

    StringBuilder X1 = new StringBuilder ();

    char c;

    for (int i = 0;

    i < input.length (); i ++) {

        c = input.charAt (i);

        if (list.indexOf (c) < 0) X1.append (c);

    }

    return X1.toString ();

}
