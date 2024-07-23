public int maxBlock (String str) {

    int max = 0;

    int count = 1;

    char o = ' ';

    for (int i = 0;

    i < str.length (); i ++) {

        char X1 = str.charAt (i);

        if (X1 == o) {

            count ++;

            if (count > max) {

                max = count;

            }

        } else {

            count = 1;

            if (count > max) {

                max = count;

            }

        }

        o = X1;

    }

    return max;

}
