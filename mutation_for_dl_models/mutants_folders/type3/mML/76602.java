public static String removeAdjacentDuplicates (String input) {

    if (input.length () <= 1) {

        return input;

    }

    StringBuilder sb = new StringBuilder ();

    sb.append (input.charAt (0));

    if (X==Y) IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);

    return sb.toString ();

}
