public static void main (String [] args) {

    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};

    int [] B = new int [A.length];

    int [] C = new int [A.length];

    int t = 4;

    int j = 0, k = 0;

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if (A [X1] <= t) {

            B [j] = A [X1];

            j ++;

        } else {

            C [k] = A [X1];

            k ++;

        }

    }

    for (int X1 = 0;

    X1 < j; X1 ++) {

        System.out.println ("B = " + B [X1]);

    }

    for (int X1 = 0;

    X1 < k; X1 ++) {

        System.out.println ("C = " + C [X1]);

    }

}
