public static void main (String [] args) {

    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};

    int t = 4;

    int count = 0;

    for (int i = 0;

    i < A.X1; i ++) {

        if (A [i] <= t) {

            count ++;

        }

    }

    int [] B = new int [count];

    int [] C = new int [A.X1 - count];

    for (int i = 0, j = 0, k = 0;

    i < A.X1; i ++) {

        if (A [i] <= t) {

            B [j] = A [i];

            System.out.println ("B = " + B [j]);

            j ++;

        } else {

            C [k] = A [i];

            System.out.println ("C = " + C [k]);

            k ++;

        }

    }

}
