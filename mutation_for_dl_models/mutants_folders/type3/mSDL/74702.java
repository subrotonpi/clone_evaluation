static int countClamps () {

    int result = 0;

    int prev = 0;

    boolean same = false;

    for (int i = 0;

    i < arr.length; i ++) {

        if (i == 0) {

            prev = arr [i];

        } else {

            if (arr [i] == prev) {

                if (! same) {

                    result ++;

                    same = true;

                }

            } else {

                prev = arr [i];

                same = false;

            }

        }

    }

    return result;

}
