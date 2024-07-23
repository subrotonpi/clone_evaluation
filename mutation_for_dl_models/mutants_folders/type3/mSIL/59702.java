public static int countLines (String str) {

    if (str == null || str.isEmpty ()) {

        return 0;

    }

    int lines = 1;

    int pos = 0;

    while ((X1,pos = str.indexOf ("\n", pos) + 1) != 0) {

        lines ++;

    }

    return lines;

}
