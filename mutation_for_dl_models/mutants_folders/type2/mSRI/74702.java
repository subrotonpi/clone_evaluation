static int countClamps (int [] X1) {

    int result = 0;

    int prev = 0;

    boolean same = false;

    for (int i = 0;

    i < X1.length; i ++) {

        if (i == 0) {

            prev = X1 [i];

        } else {

            if (X1 [i] == prev) {

                if (! same) {

                    result ++;

                    same = true;

                }

            } else {

                prev = X1 [i];

                same = false;

            }

        }

    }

    return result;

}
