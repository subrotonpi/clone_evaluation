public static void printSquare (int min, int max) {

    int x = max - min + 1;

    for (int i = min;

    i <= max; i ++) {

        int counter = i;

        for (int j = 0;

        j < x; j ++) {

            System.out.print ( /* Comment */ counter);

            counter = counter >= max ? min : counter + 1;

        }

        System.out.println ();

    }

}
