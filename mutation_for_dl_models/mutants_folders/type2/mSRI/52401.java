static String decrypt (String cipher) {

    String [] X1 = cipher.split ("#");

    StringBuilder message = new StringBuilder ();

    for (String code : X1) {

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
