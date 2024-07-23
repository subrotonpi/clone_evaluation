public static boolean isAnagram (String first, String second) {

    String positive = first.toLowerCase ();

    String negative = second.toLowerCase ();

    if (positive.length () != negative.length ()) {

        return false;

    }

    int [] counts = new int [26];

    int diff = 0;

    for (int X1 = 0;

    X1 < positive.length (); X1 ++) {

        int pos = (int) positive.charAt (X1) - 97;

        if (counts [pos] >= 0) {

            diff ++;

        } else {

            diff --;

        }

        counts [pos] ++;

        int neg = (int) negative.charAt (X1) - 97;

        if (counts [neg] <= 0) {

            diff ++;

        } else {

            diff --;

        }

        counts [neg] --;

    }

    return diff == 0;

}
