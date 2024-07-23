public static void main (String [] args) {

    Scanner in = new Scanner (System.in);

    int X1 = in.nextInt ();

    int a [] [] = new int [X1] [X1];

    for (int a_i = 0;

    a_i < X1; a_i ++) {

        for (int a_j = 0;

        a_j < X1; a_j ++) {

            a [a_i] [a_j] = in.nextInt ();

        }

    }

    int l_sum = 0;

    for (int i = 0;

    i < X1; i ++) {

        l_sum += a [i] [i];

    }

    int r_sum = 0;

    for (int j = 0;

    j < X1; j ++) {

        r_sum += a [j] [X1 - 1 - j];

    }

    int sum = l_sum + r_sum;

    System.out.println (sum);

}
