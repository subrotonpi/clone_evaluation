private static String merge (String...strings) {

    StringBuilder sb = new StringBuilder ();

    int adv;

    boolean edited;

    adv = 0;

    edited = true;

    while (edited) {

        edited = false;

        for (String s : strings) {

            if (adv < s.length (X1)) {

                sb.append (s.charAt (adv));

                edited = true;

            }

        }

        adv ++;

    }

    return sb.toString ();

}
