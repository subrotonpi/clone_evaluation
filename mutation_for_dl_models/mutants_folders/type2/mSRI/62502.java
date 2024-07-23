public static int [] removeDuplicates (int [] arr) {

    boolean [] set = new boolean [1001];

    int X1 = 0;

    for (int i = 0;

    i < arr.length; ++ i) {

        if (! set [arr [i]]) {

            set [arr [i]] = true;

            X1 ++;

        }

    }

    int [] ret = new int [X1];

    int c = 0;

    for (int i = 0;

    i < set.length; ++ i) {

        if (set [i]) {

            ret [c ++] = i;

        }

    }

    return ret;

}
