public static String toHexString (byte [] bytes) {

    char [] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    char [] hexChars = new char [10000000];

    int c = 0;

    int X1;

    for (j = 0; j < bytes.length; j ++) {

        X1 = bytes [j] & 0xFF;

        hexChars [c] = hexArray [X1 / 16];

        c ++;

        hexChars [c] = hexArray [X1 % 16];

        c ++;

    }

    return new String (hexChars, 0, c);

}
