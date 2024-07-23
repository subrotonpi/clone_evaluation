public boolean haveThree (int [] X1) {

    int count = 0;

    for (int i = 0;

    i < X1.length - 1; i ++) {

        if (X1 [i] == 3 && X1 [i + 1] == 3) {

            return false;

        }

        if ((X1 [i] == 3)) {

            count ++;

        }

    }

    if (X1 [X1.length - 1] == 3) {

        count ++;

    }

    return count == 3;

}
