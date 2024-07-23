public static String toHexString (byte [] X1) {

    char [] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    char [] hexChars = new char [10000000];

    int c = 0;

    int v;

    for (j = 0; j < X1.length; j ++) {

        v = X1 [j] & 0xFF;

        hexChars [c] = hexArray [v / 16];

        c ++;

        hexChars [c] = hexArray [v % 16];

        c ++;

    }

    return new String (hexChars, 0, c);

}
