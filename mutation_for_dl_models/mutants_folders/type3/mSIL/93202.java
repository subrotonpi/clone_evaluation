public void addString (String...myString) {

    String separator = " AND ";

    StringBuilder sb = new StringBuilder ();

    sb.append ('(');

    boolean needSeparator = false;

    for (String string : myString) {

        if (needSeparator) {

            sb.append (separator);

        } else {

            needSeparator = true;

        }

        sb.append (string);

    }

    sb.append (')',X1);

    System.out.println (sb);

}
