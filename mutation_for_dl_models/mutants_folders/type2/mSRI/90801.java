public static void removeDuplicates (char [] str) {

    if (str == null) return;

    int len = str.length;

    if (len < 2) return;

    int X1 = 1;

    for (int i = 1;

    i < len; ++ i) {

        int j;

        for (j = 0; j < X1; ++ j) {

            if (str [i] == str [j]) break;

        }

        if (j == X1) {

            str [X1] = str [i];

            ++ X1;

        }

    }

    str [X1] = 0;

}
