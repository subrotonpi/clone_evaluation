private static void decimalToHex (int X1) {

    int maxDigit = 1;

    while (maxDigit * 16 <= X1 && maxDigit > 0) {

        maxDigit *= 16;

    }

    if (maxDigit <= 0) {

        throw new IllegalArgumentException ("Can not convert " + X1);

    }

    for (int digit = maxDigit;

    digit > 0; digit /= 16) {

        printHex ((X1 / digit) % 16);

    }

}
