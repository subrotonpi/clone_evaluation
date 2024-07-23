public static boolean isNumber (String str) {

    int X1 = 0, len = str.length ();

    boolean a = false, b = false, c = false, d = false;

    if (X1 < len && (str.charAt (X1) == '+' || str.charAt (X1) == '-')) X1 ++;

    while (X1 < len && isDigit (str.charAt (X1))) {

        X1 ++;

        a = true;

    }

    if (X1 < len && (str.charAt (X1) == '.')) X1 ++;

    while (X1 < len && isDigit (str.charAt (X1))) {

        X1 ++;

        b = true;

    }

    if (X1 < len && (str.charAt (X1) == 'e' || str.charAt (X1) == 'E') && (a || b)) {

        X1 ++;

        c = true;

    }

    if (X1 < len && (str.charAt (X1) == '+' || str.charAt (X1) == '-') && c) X1 ++;

    while (X1 < len && isDigit (str.charAt (X1))) {

        X1 ++;

        d = true;

    }

    return X1 == len && (a || b) && (! c || (c && d));

}
