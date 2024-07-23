public static void main (String [] args) {

    int n = 7;

    for (int i = 0;

    i < 7; i ++) {

        for (int X1 = 0;

        X1 < 4; X1 ++) {

            if (i + X1 <= n - 4 || X1 == 0 || i == n - 1) System.out.print ("*");

            else if (i - X1 >= n - 4) System.out.print ("*");

            else System.out.print (" ");

        }

        System.out.println ();

    }

}
