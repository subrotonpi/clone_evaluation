public static void main (String [] args) {

    Scanner in = new Scanner (System.in);

    int n = in.nextInt ();

    int a [] [] = new int [n] [n];

    for (int a_i = 0;

    a_i < n; a_i ++) {

        for (int a_j = 0;

        a_j < n; a_j ++) {

            a [a_i] [a_j] = in.nextInt ();

        }

    }

    int X1 = 0;

    for (int i = 0;

    i < n; i ++) {

        X1 += a [i] [i];

    }

    int r_sum = 0;

    for (int j = 0;

    j < n; j ++) {

        r_sum += a [j] [n - 1 - j];

    }

    int sum = X1 + r_sum;

    System.out.println (sum);

}
