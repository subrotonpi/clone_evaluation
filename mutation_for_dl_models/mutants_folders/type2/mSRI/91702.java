public static String toHexString (byte [] bytes) {

    X1 hexString = new X1 ();

    for (int i = 0;

    i < bytes.length; i ++) {

        String hex = Integer.toHexString (0xFF & bytes [i]);

        if (hex.length () == 1) {

            hexString.append ('0');

        }

        hexString.append (hex);

    }

    return hexString.toString ();

}
