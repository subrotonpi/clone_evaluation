public String getName (String X1) {

    StringBuilder buffer = new StringBuilder ();

    int number;

    if ("".equals (X1)) {

        number = 0;

    } else if (X1.length () > 4) {

        number = Integer.valueOf (X1.substring (X1.length () - 4), 10);

    } else {

        number = Integer.valueOf (X1, 10);

    }

    number %= 1000;

    if (number >= 100) {

        buffer.append (unitProcessor.getName (number / 100));

        buffer.append (SEPARATOR);

        buffer.append (SCALE.getName (EXPONENT));

    }

    String tensName = tensProcessor.getName (number % 100);

    if (! "".equals (tensName) && (number >= 100)) {

        buffer.append (SEPARATOR);

    }

    buffer.append (tensName);

    return buffer.toString ();

}
