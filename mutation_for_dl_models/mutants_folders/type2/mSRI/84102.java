public static String join (String separator, String...values) {

    if (values.length == 0) return "";

    char [] X1 = separator.toCharArray ();

    int totalSize = (values.length - 1) * X1.length;

    for (int i = 0;

    i < values.length; i ++) {

        if (values [i] == null) values [i] = "";

        else totalSize += values [i].length ();

    }

    char [] joined = new char [totalSize];

    int pos = 0;

    for (int i = 0, end = values.length - 1;

    i < end; i ++) {

        System.arraycopy (values [i].toCharArray (), 0, joined, pos, values [i].length ());

        pos += values [i].length ();

        System.arraycopy (X1, 0, joined, pos, X1.length);

        pos += X1.length;

    }

    System.arraycopy (values [values.length - 1].toCharArray (), 0, joined, pos, values [values.length - 1].length ());

    return new String (joined);

}
