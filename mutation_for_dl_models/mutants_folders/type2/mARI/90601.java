private static void removeDuplicates (char [] str) {

    if (str == null || str.length < 2) {

        return;

    }

    int X1 = 0;

    for (int i = 0;

    i < str.length; i ++) {

        boolean found = false;

        for (int j = 0;

        j < i; j ++) {

            if (str [j] == str [i]) {

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
