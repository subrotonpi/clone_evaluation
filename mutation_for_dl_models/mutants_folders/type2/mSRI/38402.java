public void sort (int [] X1) {

    for (int i = 0;

    i < X1.length - 1; i ++) {

        int k = i + 1;

        int nxtVal = X1 [k];

        while (X1 [k - 1] > nxtVal) {

            X1 [k] = X1 [k - 1];

            k --;

            if (k == 0) break;

        }

        X1 [k] = nxtVal;

    }

    System.out.println ("Medium sorting is done and the result is :");

    for (int i : X1) {

        System.out.print (i + ",");

    }

}
