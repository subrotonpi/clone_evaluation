public static void main (String [] args) {

    int X1 = 7;

    int mid = X1 / 2;

    for (int i = 0;

    i < X1; i ++) {

        for (int j = 0;

        j < Math.abs (mid - i) + 1; j ++) {

            System.out.print ("*");

        }

        System.out.println ();

    }

}
