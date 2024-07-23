public static void main (String [] args) {

    for (int row = 1;

    row <= 7; row += 2) {

        for (int space = 7;

        space >= row; space -= 2) {

            System.out.print ("*");

        }

        for (int X1 = 1;

        X1 <= row; X1 ++) {

            System.out.print (" ");

        }

        System.out.print ("\n");

    }

    for (int row = 5;

    row >= 1; row -= 2) {

        for (int space = 7;

        space >= row; space -= 2) {

            System.out.print ("*");

        }

        for (int X1 = 1;

        X1 <= row; X1 ++) {

            System.out.print (" ");

        }

        System.out.print ("\n");

    }

}
