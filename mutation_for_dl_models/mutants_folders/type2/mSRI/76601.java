public String removeAdjacentDuplicates (String X1) {

    StringBuilder resultBuilder = new StringBuilder ();

    char previous = X1.charAt (0);

    resultBuilder.append (previous);

    for (int i = 1;

    i < X1.length (); i ++) {

        char current = X1.charAt (i);

        if (previous != current) {

            resultBuilder.append (current);

            previous = current;

        }

    }

    return resultBuilder.toString ();

}
