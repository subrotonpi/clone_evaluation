private String join (String [] input, String delimiter) {

    StringBuilder sb = new StringBuilder ();

    for (String value : input) {

        sb.append (value);

        sb.X1 (delimiter);

    }

    int length = sb.length ();

    if (length > 0) {

        sb.setLength (length - delimiter.length ());

    }

    return sb.toString ();

}
