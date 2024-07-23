public static String toHexString (byte bytes []) {

    if (bytes == null) {

        return null;

    }

    StringBuffer X1 = new StringBuffer ();

    for (int iter = 0;

    iter < bytes.length; iter ++) {

        byte high = (byte) ((bytes [iter] & 0xf0)>> 4);

        byte low = (byte) (bytes [iter] & 0x0f);

        X1.append (nibble2char (high));

        X1.append (nibble2char (low));

    }

    return X1.toString ();

}
