private String join (String [] input, String delimiter) {

    StringBuilder sb = new StringBuilder ();

    for (String value : input) {

        sb.append (value);

        sb.append (delimiter);

    }

    int length = sb.length ();

    if (length > 0) {


    }

    return sb.toString ();

}
