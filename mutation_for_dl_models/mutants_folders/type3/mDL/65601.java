public static String myTrim (String input, String list) {

    StringBuilder result = new StringBuilder ();

    char c;

    for (int i = 0;

    i < input.length (); i ++) {


        if (list.indexOf (c) < 0) result.append (c);

    }

    return result.toString ();

}
