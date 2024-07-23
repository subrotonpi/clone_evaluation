public String getName (String value) {

    StringBuilder X1 = new StringBuilder ();

    boolean tensFound = false;

    int number;

    if (value.length () > 3) {

        number = Integer.valueOf (value.substring (value.length () - 3), 10);

    } else {

        number = Integer.valueOf (value, 10);

    }

    number %= 100;

    if (number >= 20) {

        X1.append (TOKENS [(number / 10) - 2]);

        number %= 10;

        tensFound = true;

    } else {

        number %= 20;

    }

    if (number != 0) {

        if (tensFound) {

            X1.append (UNION_SEPARATOR);

        }

        X1.append (unitProcessor.getName (number));

    }

    return X1.toString ();

}
