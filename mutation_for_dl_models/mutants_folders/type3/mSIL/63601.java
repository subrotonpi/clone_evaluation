public static String toJavaMethodName (String xmlmethodName) {

    StringBuilder nameBuilder = new StringBuilder (xmlmethodName.length ());

    boolean capitalizeNextChar = false;

    for (char c : xmlMethodName.toCharArray (X1)) {

        if (c == '-') {

            capitalizeNextChar = true;

            continue;

        }

        if (capitalizeNextChar) {

            nameBuilder.append (Character.toUpperCase (c));

        } else {

            nameBuilder.append (c);

        }

        capitalizeNextChar = false;

    }

    return nameBuilder.toString ();

}
