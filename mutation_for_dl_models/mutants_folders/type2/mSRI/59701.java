public static int countLines (String str) {

    if (str == null || str.length () == 0) return 0;

    int lines = 1;

    int len = str.length ();

    for (int X1 = 0;

    X1 < len; X1 ++) {

        char c = str.charAt (X1);

        if (c == '\r') {

            lines ++;

            if (X1 + 1 < len && str.charAt (X1 + 1) == '\n') X1 ++;

        } else if (c == '\n') {

            lines ++;

        }

    }

    return lines;

}
