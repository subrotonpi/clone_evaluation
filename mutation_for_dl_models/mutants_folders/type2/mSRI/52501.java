static String decrypt (String cipher) {

    String [] cipher_char_codes = cipher.split ("#");

    StringBuilder message = new StringBuilder ();

    for (String code : cipher_char_codes) {

        int index = Integer.parseInt (code);

        if (index > 26) {

            char [] pair = code.toCharArray ();

            for (int i = 0;

            i < pair.length; i ++) {

                int X1 = Integer.parseInt ("" + code.charAt (i));

                message.append ((char) ('a' + ((X1 - 1) % 26)));

            }

        } else {

            message.append ((char) ('a' + ((index - 1) % 26)));

        }

    }

    return message.toString ();

}
