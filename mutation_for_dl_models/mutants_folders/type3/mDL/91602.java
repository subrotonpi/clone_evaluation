public static String toHexString (byte [] bytes) {

    StringBuilder hexString = new StringBuilder ();

    for (int i = 0;

    i < bytes.length; i ++) {


        if (hex.length () == 1) {

            hexString.append ('0');

        }

        hexString.append (hex);

    }

    return hexString.toString ();

}