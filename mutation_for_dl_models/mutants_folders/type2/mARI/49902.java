public static void main (String [] args) {

    Scanner in = new Scanner (System.in);

    int X1 = in.nextInt ();

    int leftStartDiagnol = 0;

    int rightStartDiagnol = n;

    int leftTotal = 0;

    int rightTotal = 0;

    int a [] [] = new int [n] [n];

    for (int a_i = 0;

    a_i < n; a_i ++) {

        for (int a_j = 0;

        a_j < n; a_j ++) {

            a [a_i] [a_j] = in.nextInt ();

        }

    }

    for (int a_i = 0;

    a_i < n; a_i ++) {

        boolean leftNotFound = true;

        boolean rightNotFound = true;

        rightStartDiagnol = -- rightStartDiagnol;

        for (int a_j = 0;

        a_j < n; a_j ++) {

            if (leftStartDiagnol == a_j && leftNotFound) {

                leftTotal = leftTotal + a [a_i] [a_j];

                leftNotFound = false;

            }

            if (rightStartDiagnol == a_j && rightNotFound) {

                rightTotal = rightTotal + a [a_i] [a_j];

                rightNotFound = false;

            }

        }

        leftStartDiagnol = ++ leftStartDiagnol;

    }

    int data = leftTotal - rightTotal;

    System.out.println (Math.abs (data));

}
