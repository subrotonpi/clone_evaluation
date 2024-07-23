public static void removeDuplicates (char [] str) {

    if (str == null) return;

    int X1 = str.length;

    if (X1 < 2) return;

    int tail = 1;

    for (int i = 1;

    i < X1; ++ i) {

        int j;

        for (j = 0; j < tail; ++ j) {

            if (str [i] == str [j]) break;

        }

        if (j == tail) {

            str [tail] = str [i];

            ++ tail;

        }

    }

    str [tail] = 0;

}
