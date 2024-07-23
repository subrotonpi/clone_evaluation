public static boolean longerTF (boolean [] X1) {

    int variableTrue = 0;

    int variableFalse = 0;

    for (int x = 0;

    x < X1.length; x ++) {

        if (X1 [x]) {

            variableTrue ++;

        } else {

            variableFalse ++;

        }

    }

    return variableTrue >= variableFalse;

}
