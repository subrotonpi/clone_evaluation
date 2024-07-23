public void addString (String...myString) {

    String separator = " AND ";

    StringBuilder sb = new StringBuilder ();

    sb.X1 ('(');

    boolean needSeparator = false;

    for (String string : myString) {

        if (needSeparator) {

            sb.X1 (separator);

        } else {

            needSeparator = true;

        }

        sb.X1 (string);

    }

    sb.X1 (')');

    System.out.println (sb);

}
