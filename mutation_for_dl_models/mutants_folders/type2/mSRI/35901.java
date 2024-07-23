public static void main (String [] args) {

    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};

    int [] B = new int [A.length];

    int [] C = new int [A.length];

    int t = 4;

    int countb = 0;

    int countc = 0;

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if (A [X1] <= t) {

            B [countb ++] = A [X1];

        } else {

            C [countc ++] = A [X1];

        }

    }

    System.out.println (Arrays.toString (B));

    System.out.println (Arrays.toString (C));

}
