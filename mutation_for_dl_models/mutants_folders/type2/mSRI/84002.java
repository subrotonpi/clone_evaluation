public static String join (String separator, String...X1) {

    if (X1.length == 0) return "";

    char [] sep = separator.toCharArray ();

    int totalSize = (X1.length - 1) * sep.length;

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] == null) X1 [i] = "";

        else totalSize += X1 [i].length ();

    }

    char [] joined = new char [totalSize];

    int pos = 0;

    for (int i = 0, end = X1.length - 1;

    i < end; i ++) {

        System.arraycopy (X1 [i].toCharArray (), 0, joined, pos, X1 [i].length ());

        pos += X1 [i].length ();

        System.arraycopy (sep, 0, joined, pos, sep.length);

        pos += sep.length;

    }

    System.arraycopy (X1 [X1.length - 1].toCharArray (), 0, joined, pos, X1 [X1.length - 1].length ());

    return new String (joined);

}
