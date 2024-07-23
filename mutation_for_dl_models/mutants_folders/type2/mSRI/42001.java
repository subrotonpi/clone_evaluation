public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    int X1;

    if (value.isEmpty ()) {

        X1 = 0;

    } else if (value.length () > 4) {

        X1 = Integer.valueOf (value.substring (value.length () - 4), 10);

    } else {

        X1 = Integer.valueOf (value, 10);

    }

    X1 %= 1000;

    if (X1 >= 100) {

        buffer.append (unitProcessor.getName (X1 / 100));

        buffer.append (SEPARATOR);

        buffer.append (SCALE.getName (EXPONENT));

    }

    String tensName = tensProcessor.getName (X1 % 100);

    if (! tensName.isEmpty () && (X1 >= 100)) {

        buffer.append (SEPARATOR);

    }

    buffer.append (tensName);

    return buffer.toString ();

}
