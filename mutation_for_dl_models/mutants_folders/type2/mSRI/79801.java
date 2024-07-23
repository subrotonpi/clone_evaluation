private static String merge (String...strings) {

    StringBuilder X1 = new StringBuilder ();

    int adv;

    boolean edited;

    adv = 0;

    edited = true;

    while (edited) {

        edited = false;

        for (String s : strings) {

            if (adv < s.length ()) {

                X1.append (s.charAt (adv));

                edited = true;

            }

        }

        adv ++;

    }

    return X1.toString ();

}
