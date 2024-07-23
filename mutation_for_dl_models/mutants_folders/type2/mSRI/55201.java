public static boolean isAnagram (String first, String second) {

    String positive = first.toLowerCase ();

    String negative = second.toLowerCase ();

    if (positive.length () != negative.length ()) {

        return false;

    }

    int [] X1 = new int [26];

    int diff = 0;

    for (int i = 0;

    i < positive.length (); i ++) {

        int pos = (int) positive.charAt (i) - 97;

        if (X1 [pos] >= 0) {

            diff ++;

        } else {

            diff --;

        }

        X1 [pos] ++;

        int neg = (int) negative.charAt (i) - 97;

        if (X1 [neg] <= 0) {

            diff ++;

        } else {

            diff --;

        }

        X1 [neg] --;

    }

    return diff == 0;

}
