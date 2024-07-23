public String getName (String value) {

    boolean negative = false;

    if (value.startsWith ("-")) {

        negative = true;

        value = value.substring (1);

    }

    int decimals = value.indexOf (".");

    String decimalValue = null;

    if (0 <= decimals) {

        decimalValue = value.substring (decimals + 1);

        value = value.substring (0, decimals);

    }

    String X1 = processor.getName (value);

    if (X1.isEmpty ()) {

        X1 = ZERO_TOKEN;

    } else if (negative) {

        X1 = MINUS.concat (SEPARATOR).concat (X1);

    }

    if (! (null == decimalValue || decimalValue.isEmpty ())) {

        X1 = X1.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

    }

    return X1;

}
