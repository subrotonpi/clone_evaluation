public static int [] [] getRows (int i, int X1, int [] [] array) {

    int [] [] ret = new int [X1 - i] [];

    for (int k = i;

    k < X1; k ++) {

        ret [k - i] = new int [array [k].length];

        for (int m = 0;

        m < ret [k - i].length; m ++) {

            ret [k - i] [m] = array [k] [m];

        }

    }

    return ret;

}
