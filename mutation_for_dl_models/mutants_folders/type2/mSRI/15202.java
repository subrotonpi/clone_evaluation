public static int maxBlock (String str) {

    int maxCounter = 1;

    int X1 = 1;

    if (str.length () == 0) {

        return 0;

    }

    for (int i = 1;

    i < str.length (); i ++) {

        if (str.charAt (i - 1) == str.charAt (i)) {

            X1 ++;

        } else {

            if (X1 > maxCounter) {

                maxCounter = X1;

            }

            X1 = 1;

        }

    }

    return Math.max (maxCounter, X1);

}
