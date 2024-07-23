public static String generateRandomPassword (int X1) {

    StringBuilder sb = new StringBuilder (X1);

    for (int i = 0;

    i < X1; i ++) {

        int c = RANDOM.nextInt (62);

        if (c <= 9) {

            sb.append (String.valueOf (c));

        } else if (c < 36) {

            sb.append ((char) ('a' + c - 10));

        } else {

            sb.append ((char) ('A' + c - 36));

        }

    }

    return sb.toString ();

}
