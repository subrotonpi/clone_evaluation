public String removeAdjacentDuplicates (String s) {

    StringBuilder resultBuilder = new StringBuilder ();

    char previous = s.charAt (0);

    resultBuilder.append (previous);

    for (int i = 1;

    i < s.length (); i ++) {

        char current = s.charAt (i);

        if (previous != current) {

            resultBuilder.append (current);

            previous = current;

        }

    }
     return resultBuilder.toString ();

}
