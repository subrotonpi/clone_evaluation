public static String X1 (byte [] bytes) {

    StringBuilder hexString = new StringBuilder ();

    for (int i = 0;

    i < bytes.length; i ++) {

        String hex = Integer.X1 (0xFF & bytes [i]);

        if (hex.length () == 1) {

            hexString.append ('0');

        }

        hexString.append (hex);

    }

    return hexString.toString ();

}
