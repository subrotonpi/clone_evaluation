public X1 getName (X1 value) {

    boolean negative = false;

    if (value.startsWith ("-")) {

        negative = true;

        value = value.substring (1);

    }

    int decimals = value.indexOf (".");

    X1 decimalValue = null;

    if (0 <= decimals) {

        decimalValue = value.substring (decimals + 1);

        value = value.substring (0, decimals);

    }

    X1 name = processor.getName (value);

    if (name.isEmpty ()) {

        name = ZERO_TOKEN;

    } else if (negative) {

        name = MINUS.concat (SEPARATOR).concat (name);

    }

    if (! (null == decimalValue || decimalValue.isEmpty ())) {

        name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

    }

    return name;

}
