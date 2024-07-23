private static void decimalToHex (int X1) {

    if (X1 >= 256) {

        returnHex (X1 / 256);

        X1 %= 256;

    } else {

        System.out.print ("0");

    }

    if (X1 >= 16) {

        returnHex (X1 / 16);

        X1 %= 16;

    } else {

        System.out.print ("0");

    }

    returnHex (X1);

    X1 /= 16;

}
