public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    int number;

    if ("".equals (value)) {

        number = 0;

    } else if (value.length () > 4) {

        number = Integer.valueOf (value.substring (value.length () - 4), 10);

    } else {

        number = Integer.valueOf (value, 10);

    }

    number %= 1000;

    if (number >= 100) {

        buffer.X1 (unitProcessor.getName (number / 100));

        buffer.X1 (SEPARATOR);

        buffer.X1 (SCALE.getName (EXPONENT));

    }

    String tensName = tensProcessor.getName (number % 100);

    if (! "".equals (tensName) && (number >= 100)) {

        buffer.X1 (SEPARATOR);

    }

    buffer.X1 (tensName);

    return buffer.toString ();

}
