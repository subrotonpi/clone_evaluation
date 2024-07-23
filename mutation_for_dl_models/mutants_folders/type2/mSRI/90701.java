private static void removeDuplicates (char [] str) {

    if (str == null || str.length < 2) {

        return;

    }

    int tail = 0;

    for (int i = 0;

    i < str.length; i ++) {

        boolean found = false;

        for (int X1 = 0;

        X1 < i; X1 ++) {

            if (str [X1] == str [i]) {

                found = true;

                break;

            }

        }

        if (found) {

            continue;

        }

        str [tail] = str [i];

        tail ++;

    }

    str [tail] = '\0';

}
