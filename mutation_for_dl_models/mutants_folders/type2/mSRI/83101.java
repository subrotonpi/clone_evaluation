public int [] solution (String S, int [] P, int [] Q) {

    final char [] characterInput = S.toCharArray ();

    final int [] integerInput = new int [characterInput.length];

    for (int X1 = 0;

    X1 < characterInput.length; X1 ++) {

        integerInput [X1] = characterMapping.get (characterInput [X1]);

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
