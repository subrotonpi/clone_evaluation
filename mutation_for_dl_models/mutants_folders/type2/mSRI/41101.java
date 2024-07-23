public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    int X1 = NO_VALUE;

    int number;

    if (value.length () > 3) {

        number = Integer.valueOf (value.substring (value.length () - 3), 10);

    } else {

        number = Integer.valueOf (value, 10);

    }

    number %= 100;

    if (number < 10) {

        X1 = (number % 10) - 1;

    } else if (number < 20) {

        X1 = (number % 20) - 1;

    }

    if (X1 != NO_VALUE && X1 < TOKENS.length) {

        buffer.append (TOKENS [X1]);

    }

    return buffer.toString ();

}
