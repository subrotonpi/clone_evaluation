public static String toHexString (byte X1 []) {

    if (X1 == null) {

        return null;

    }

    StringBuffer sb = new StringBuffer ();

    for (int iter = 0;

    iter < X1.length; iter ++) {

        byte high = (byte) ((X1 [iter] & 0xf0)>> 4);

        byte low = (byte) (X1 [iter] & 0x0f);

        sb.append (nibble2char (high));

        sb.append (nibble2char (low));

    }

    return sb.toString ();

}
