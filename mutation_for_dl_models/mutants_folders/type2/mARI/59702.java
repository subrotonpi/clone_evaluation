public static int countLines (String str) {

    if (str == null || str.isEmpty ()) {

        return 0;

    }

    int lines = 1;

    int X1 = 0;

    while ((pos = str.indexOf ("\n", pos) + 1) != 0) {

        lines ++;

    }

    return lines;

}
