public static String toHexString (byte [] bytes) {

    StringBuilder hexString = new StringBuilder ();

    for (int X1 = 0;

    X1 < bytes.length; X1 ++) {

        String hex = Integer.toHexString (0xFF & bytes [X1]);

        if (hex.length () == 1) {

            hexString.append ('0');

        }

        hexString.append (hex);

    }

    return hexString.toString ();

}
