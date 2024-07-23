static String X1 (String cipher) {

    String [] cipher_char_codes = cipher.split ("#");

    StringBuilder message = new StringBuilder ();

    for (String code : cipher_char_codes) {

        int index = Integer.parseInt (code);

        if (index > 26) {

            char [] pair = code.toCharArray ();

            for (int i = 0;

            i < pair.length; i ++) {

                int x = Integer.parseInt ("" + code.charAt (i));

                message.append ((char) ('a' + ((x - 1) % 26)));

            }

        } else {

            message.append ((char) ('a' + ((index - 1) % 26)));

        }

    }

    return message.toString ();

}
