public String getName (String value) {

    StringBuilder X1 = new StringBuilder ();

    int number;

    if (value.isEmpty ()) {

        number = 0;

    } else if (value.length () > 4) {

        number = Integer.valueOf (value.substring (value.length () - 4), 10);

    } else {

        number = Integer.valueOf (value, 10);

    }

    number %= 1000;

    if (number >= 100) {

        X1.append (unitProcessor.getName (number / 100));

        X1.append (SEPARATOR);

        X1.append (SCALE.getName (EXPONENT));

    }

    String tensName = tensProcessor.getName (number % 100);

    if (! tensName.isEmpty () && (number >= 100)) {

        X1.append (SEPARATOR);

    }

    X1.append (tensName);

    return X1.toString ();

}
