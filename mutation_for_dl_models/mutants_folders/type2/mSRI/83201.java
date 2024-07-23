public int [] solution (String S, int [] X1, int [] Q) {

    final char [] characterInput = S.toCharArray ();

    final int [] integerInput = new int [characterInput.length];

    for (int counter = 0;

    counter < characterInput.length; counter ++) {

        integerInput [counter] = characterMapping.get (characterInput [counter]);

    }

    int [] result = new int [X1.length];

    for (int index = 0;

    index < X1.length; index ++) {

        if (X1 [index] == Q [index]) {

            result [index] = integerInput [X1 [index]];

            break;

        }

        final int [] subArray = Arrays.copyOfRange (integerInput, X1 [index], Q [index] + 1);

        final int minimumValue = minimum (subArray);

        result [index] = minimumValue;

    }

    return result;

}
