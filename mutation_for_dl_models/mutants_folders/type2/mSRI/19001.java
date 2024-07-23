public static void printSquare (int min, int max) {

    int X1 = max - min + 1;

    for (int i = min;

    i <= max; i ++) {

        int counter = i;

        for (int j = 0;

        j < X1; j ++) {

            System.out.print (counter);

            counter = counter >= max ? min : counter + 1;

        }

        System.out.println ();

    }

}
