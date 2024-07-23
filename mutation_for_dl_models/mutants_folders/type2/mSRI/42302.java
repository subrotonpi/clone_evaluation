public String getName (String value) {

    boolean negative = false;

    if (value.startsWith ("-")) {

        negative = true;

        value = value.substring (1);

    }

    int decimals = value.indexOf (".");

    String X1 = null;

    if (0 <= decimals) {

        X1 = value.substring (decimals + 1);

        value = value.substring (0, decimals);

    }

    String name = processor.getName (value);

    if ("".equals (name)) {

        name = ZERO_TOKEN;

    } else if (negative) {

        name = MINUS.concat (SEPARATOR).concat (name);

    }

    if (! (null == X1 || "".equals (X1))) {

        String zeroDecimalValue = "";

        for (int i = 0;

        i < X1.length (); i ++) {

            zeroDecimalValue = zeroDecimalValue + "0";

        }

        if (X1.equals (zeroDecimalValue)) {

            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat ("zero").concat (SEPARATOR).concat (SCALE.getName (- X1.length ()));

        } else {

            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (X1)).concat (SEPARATOR).concat (SCALE.getName (- X1.length ()));

        }

    }

    return name;

}
