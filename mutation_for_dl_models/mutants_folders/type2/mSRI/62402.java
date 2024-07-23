public static int [] removeDuplicates (int [] arr) {

    boolean [] set = new boolean [1001];

    int totalItems = 0;

    for (int X1 = 0;

    X1 < arr.length; ++ X1) {

        if (! set [arr [X1]]) {

            set [arr [X1]] = true;

            totalItems ++;

        }

    }

    int [] ret = new int [totalItems];

    int c = 0;

    for (int X1 = 0;

    X1 < set.length; ++ X1) {

        if (set [X1]) {

            ret [c ++] = X1;

        }

    }

    return ret;

}
