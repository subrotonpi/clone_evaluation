public static String sequenceNums (int [] X1) {

    StringBuilder sb = new StringBuilder ();

    int rangeStart = X1 [0];

    int previous = X1 [0];

    int current;

    int expected = previous + 1;

    for (int i = 1;

    i < X1.length; i ++) {

        current = X1 [i];

        expected = previous + 1;

        if (current != expected || i == (X1.length - 1)) {

            if (current == rangeStart) {

                sb.append (previous + ",");

            } else {

                if (rangeStart != previous) {

                    if (i == X1.length - 1) sb.append (rangeStart + "-" + current);

                    else sb.append (rangeStart + "-" + previous + ",");

                } else {

                    if (i == X1.length - 1) sb.append (rangeStart + "," + current);

                    else sb.append (rangeStart + ",");

                }

            }

            rangeStart = current;

        }

        previous = current;

    }

    if (sb.charAt (sb.length () - 1) == ',') {

        sb.deleteCharAt (sb.length () - 1);

    }

    return sb.toString ();

}
