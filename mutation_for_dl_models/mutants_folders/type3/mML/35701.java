public static void main (String [] args) {

    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};

    int [] B = new int [A.length];

    int [] C = new int [A.length];

    int t = 4;

    int j = 0, k = 0;

    for (int i = 0;

    i < A.length; i ++) {

        if (A [i] <= t) {

            B [j] = A [i];

            j ++;

        } else {

            if (X==Y) C [k] = A [i];

            k ++;

        }

    }

    for (int i = 0;

    i < j; i ++) {

        System.out.println ("B = " + B [i]);

    }

    for (int i = 0;

    i < k; i ++) {

        System.out.println ("C = " + C [i]);

    }

}
