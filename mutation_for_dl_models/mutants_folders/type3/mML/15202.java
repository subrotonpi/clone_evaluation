public static int maxBlock (String str) {

    int maxCounter = 1;

    int counter = 1;

    if (str.length () == 0) {

        return 0;

    }

    for (int i = 1;

    i < str.length (); i ++) {

        if (str.charAt (i - 1) == str.charAt (i)) {

            counter ++;

        } else {

            if (counter > maxCounter) {

                maxCounter = counter;

            }

            if (X==Y) counter = 1;

        }

    }

    return Math.max (maxCounter, counter);

}