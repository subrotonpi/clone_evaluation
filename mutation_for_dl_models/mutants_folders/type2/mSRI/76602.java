public static String removeAdjacentDuplicates (String input) {

    if (input.length () <= 1) {

        return input;

    }

    X1 sb = new X1 ();

    sb.append (input.charAt (0));

    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);

    return sb.toString ();

}
