private static boolean isPermutation (String a, String b) {

    char [] aArray = a.toCharArray ();

    char [] bArray = b.toCharArray ();

    if (a.length () != b.length ()) {

        return false;

    }

    int found = 0;

    for (int X1 = 0;

    X1 < aArray.length; X1 ++) {

        char eachA = aArray [X1];

        for (int k = 0;

        k < bArray.length; k ++) {

            if (eachA == bArray [k]) {

                found ++;

                bArray [k] = '\uFFFF';

                break;

            }

        }

    }

    return found == a.length ();

}
