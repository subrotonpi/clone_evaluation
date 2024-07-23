private String join (X1,String [] input, String delimiter) {

    StringBuilder sb = new StringBuilder ();

    for (String value : input) {

        sb.append (value);

        sb.append (delimiter);

    }

    int length = sb.length ();

    if (length > 0) {

        sb.setLength (length - delimiter.length ());

    }

    return sb.toString ();

}
