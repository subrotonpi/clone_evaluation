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

    if ("".equals (X1)) {

        X1 = ZERO_TOKEN;

    } else if (negative) {

        X1 = MINUS.concat (SEPARATOR).concat (X1);

    }

    if (! (null == decimalValue || "".equals (decimalValue))) {

        String zeroDecimalValue = "";

        for (int i = 0;

        i < decimalValue.length (); i ++) {

            zeroDecimalValue = zeroDecimalValue + "0";

        }

        if (decimalValue.equals (zeroDecimalValue)) {

            X1 = X1.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat ("zero").concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

        } else {

            X1 = X1.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));

        }

    }

    return X1;

}
