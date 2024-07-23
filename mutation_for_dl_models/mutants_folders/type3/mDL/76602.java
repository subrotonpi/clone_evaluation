public static String removeAdjacentDuplicates (String input) {

    if (input.length () <= 1) {

        return input;

    }

    StringBuilder sb = new StringBuilder ();

    sb.append (input.charAt (0));


    return sb.toString ();

}
