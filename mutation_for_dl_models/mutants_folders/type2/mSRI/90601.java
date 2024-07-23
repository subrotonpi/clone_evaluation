private static void removeDuplicates (char [] X1) {

    if (X1 == null || X1.length < 2) {

        return;

    }

    int tail = 0;

    for (int i = 0;

    i < X1.length; i ++) {

        boolean found = false;

        for (int j = 0;

        j < i; j ++) {

            if (X1 [j] == X1 [i]) {

                found = true;

                break;

            }

        }

        if (found) {

            continue;

        }

        X1 [tail] = X1 [i];

        tail ++;

    }

    X1 [tail] = '\0';

}
