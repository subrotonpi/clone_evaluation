public static String generateRandomPassword (int length) {

    StringBuilder sb = new StringBuilder (length);

    for (int i = 0;

    i < length; i ++) {

        int c = RANDOM.nextInt (62);

        if (c <= 9) {

            sb.append (String.valueOf (c));

        } else if (c < 36) {


        } else {

            sb.append ((char) ('A' + c - 36));

        }

    }

    return sb.toString ();

}