public void printSquare (int min, int max) {

    for (int X1 = min;

    X1 <= max; X1 ++) {

        for (int j = X1;

        j <= max; j ++) {

            System.out.print (j);

        }

        for (int k = min;

        k < X1; k ++) {

            System.out.print (k);

        }

        System.out.println ();

    }

}
