public static boolean longerTF (boolean [] X1) {

    int consecutiveVariableTrue = 0, maxConsecutiveVariableTrue = 0;

    int consecutiveVariableFalse = 0, maxConsecutiveVariableFalse = 0;

    for (int x = 0;

    x < X1.length; x ++) {

        if (X1 [x] == true) {

            consecutiveVariableTrue ++;

            if (maxConsecutiveVariableTrue < consecutiveVariableTrue) maxConsecutiveVariableTrue = consecutiveVariableTrue;

        } else {

            consecutiveVariableTrue = 0;

        }

    }

    for (int x = 0;

    x < X1.length; x ++) {

        if (X1 [x] == false) {

            consecutiveVariableFalse ++;

            if (maxConsecutiveVariableFalse < consecutiveVariableFalse) maxConsecutiveVariableFalse = consecutiveVariableFalse;

        } else {

            consecutiveVariableFalse = 0;

        }

    }

    if (maxConsecutiveVariableTrue >= maxConsecutiveVariableFalse) {

        return true;

    }

    return false;

}
