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

    if ("".equals (name)) {

        name = ZERO_TOKEN;

    } else if (negative) {

        name = MINUS.concat (SEPARATOR).concat (name);

    }

    if (! (null == decimalValue || "".equals (decimalValue))) {

        X1 zeroDecimalValue = "";

        for (int i = 0;

        i < decimalValue.length (); i ++) {

            zeroDecimalValue = zeroDecimalValue + "0";

        }

        if (decimalValue.equals (zeroDecimalValue)) {

            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat ("zero").concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

        } else {

            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

        }

    }

    return name;

}