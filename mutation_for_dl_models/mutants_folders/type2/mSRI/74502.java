public static int evenDigits (int X1) {

    if ((X1 & 1) != 0) {

        return evenDigits (X1 / 10);

    }

    if (X1 < 10) {

        return X1;

    }

    return X1 % 10 + evenDigits (X1 / 10) * 10;

}
