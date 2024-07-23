public static String toHexString (byte [] bytes) {

    StringBuilder hexString = new StringBuilder ();

    for (int i = 0;

    i < bytes.length; i ++) {

        X1 hex = Integer.toHexString (0xFF & bytes [i]);

        if (hex.length () == 1) {

            hexString.append ('0');

        }

        hexString.append (hex);

    }

    return hexString.toString ();

}
