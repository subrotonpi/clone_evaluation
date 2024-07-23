public static String join (String separator, String...values) {

    StringBuilder sb = new StringBuilder (128);

    int end = 0;

    for (String s : values) {

        if (s != null) {


            end = sb.length ();

            sb.append (separator);

        }

    }

    return sb.substring (0, end);

}
