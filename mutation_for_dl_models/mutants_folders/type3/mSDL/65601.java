public static String myTrim (String list) {

    StringBuilder result = new StringBuilder ();

    char c;

    for (int i = 0;

    i < input.length (); i ++) {

        c = input.charAt (i);

        if (list.indexOf (c) < 0) result.append (c);

    }

    return result.toString ();

}
