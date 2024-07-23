public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    int offset = NO_VALUE;

    int X1;

    if (value.length () > 3) {

        X1 = Integer.valueOf (value.substring (value.length () - 3), 10);

    } else {

        X1 = Integer.valueOf (value, 10);

    }

    X1 %= 100;

    if (X1 < 10) {

        offset = (X1 % 10) - 1;

    } else if (X1 < 20) {

        offset = (X1 % 20) - 1;

    }

    if (offset != NO_VALUE && offset < TOKENS.length) {

        buffer.append (TOKENS [offset]);

    }

    return buffer.toString ();

}
