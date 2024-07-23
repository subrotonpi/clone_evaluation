public static int countLines (String str) {

    if (str == null || str.isEmpty ()) {

        return 0;

    }

    int X1 = 1;

    int pos = 0;

    while ((pos = str.indexOf ("\n", pos) + 1) != 0) {

        X1 ++;

    }

    return X1;

}
