public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    boolean tensFound = false;

    int X1;

    if (value.length () > 3) {

        X1 = Integer.valueOf (value.substring (value.length () - 3), 10);

    } else {

        X1 = Integer.valueOf (value, 10);

    }

    X1 %= 100;

    if (X1 >= 20) {

        buffer.append (TOKENS [(X1 / 10) - 2]);

        X1 %= 10;

        tensFound = true;

    } else {

        X1 %= 20;

    }

    if (X1 != 0) {

        if (tensFound) {

            buffer.append (UNION_SEPARATOR);

        }

        buffer.append (unitProcessor.getName (X1));

    }

    return buffer.toString ();

}
