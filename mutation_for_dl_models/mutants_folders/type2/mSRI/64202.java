private String join (String [] input, String delimiter) {

    X1 sb = new X1 ();

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
