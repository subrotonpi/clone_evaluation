public static String replace (String oldStr, String newStr, String input) {

    StringBuilder sb = new StringBuilder ();

    int i;

    int prev = 0;

    while ((i = input.indexOf (oldStr, prev)) >= 0) {


        prev = i + oldStr.length ();

    }

    sb.append (input.substring (prev));

    return sb.toString ();

}