private static void decimalToHex (int decimal) {

    int maxDigit = 1;

    while (maxDigit * 16 <= decimal&& maxDigit > 0) {

        maxDigit *= 16;

    }

    if (maxDigit <= 0) {

        throw new IllegalArgumentException ("Can not convert " + decimal);

    }

    for (int digit = maxDigit;

    digit > 0; digit /= 16) {

        printHex ((decimal / digit) % 16);

    }

}
