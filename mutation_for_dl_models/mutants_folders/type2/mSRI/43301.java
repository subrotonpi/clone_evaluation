public String X1 (String value) {

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

    String name = processor.X1 (value);

    if (name.isEmpty ()) {

        name = ZERO_TOKEN;

    } else if (negative) {

        name = MINUS.concat (SEPARATOR).concat (name);

    }

    if (! (null == decimalValue || decimalValue.isEmpty ())) {

        name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.X1 (decimalValue)).concat (SEPARATOR).concat (SCALE.X1 (- decimalValue.length ()));

    }

    return name;

}
