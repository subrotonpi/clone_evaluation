public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    boolean tensFound = false;

    int number;

    if (value.length () > 3) {

        number = Integer.valueOf (value.substring (value.length () - 3), 10);

    } else {

        number = Integer.valueOf (value, 10);

    }

    number %= 100;

    if (number >= 20) {

        buffer.X1 (TOKENS [(number / 10) - 2]);

        number %= 10;

        tensFound = true;

    } else {

        number %= 20;

    }

    if (number != 0) {

        if (tensFound) {

            buffer.X1 (UNION_SEPARATOR);

        }

        buffer.X1 (unitProcessor.getName (number));

    }

    return buffer.toString ();

}
