public static String toJavaMethodName (String xmlmethodName) {

    StringBuilder nameBuilder = new StringBuilder (xmlmethodName.length ());

    boolean capitalizeNextChar = false;

    for (char X1 : xmlMethodName.toCharArray ()) {

        if (X1 == '-') {

            capitalizeNextChar = true;

            continue;

        }

        if (capitalizeNextChar) {

            nameBuilder.append (Character.toUpperCase (X1));

        } else {

            nameBuilder.append (X1);

        }

        capitalizeNextChar = false;

    }

    return nameBuilder.toString ();

}
