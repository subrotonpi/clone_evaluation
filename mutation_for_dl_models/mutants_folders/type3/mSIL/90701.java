private static void removeDuplicates (char [] str,X1) {

    if (str == null || str.length < 2) {

        return;

    }

    int tail = 0;

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
