public static void main (String args []) {

    int i;

    int large [] = new int [5];

    int X1 [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};

    int max = 0, index;

    for (int j = 0;

    j < 5; j ++) {

        max = X1 [0];

        index = 0;

        for (i = 1; i < X1.length; i ++) {

            if (max < X1 [i]) {

                max = X1 [i];

                index = i;

            }

        }

        large [j] = max;

        X1 [index] = Integer.MIN_VALUE;

        System.out.println ("Largest " + j + " : " + large [j]);

    }

}
