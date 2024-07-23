public int [] solution (String S, int [] P, int [] Q) {

    final char [] X1 = S.toCharArray ();

    final int [] integerInput = new int [X1.length];

    for (int counter = 0;

    counter < X1.length; counter ++) {

        integerInput [counter] = characterMapping.get (X1 [counter]);

    }

    int [] result = new int [P.length];

    for (int index = 0;

    index < P.length; index ++) {

        if (P [index] == Q [index]) {

            result [index] = integerInput [P [index]];

            break;

        }

        final int [] subArray = Arrays.copyOfRange (integerInput, P [index], Q [index] + 1);

        final int minimumValue = minimum (subArray);

        result [index] = minimumValue;

    }

    return result;

}
