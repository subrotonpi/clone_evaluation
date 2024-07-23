public static void main (String [] args) {

    int n = 7;

    int X1 = n / 2;

    for (int i = 0;

    i < n; i ++) {

        for (int j = 0;

        j < Math.abs (X1 - i) + 1; j ++) {

            System.out.print ("*");

        }

        System.out.println ();

    }

}
