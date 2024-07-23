public static void printArray (int [] [] arr) {

    System.out.println ("[");

    int rows = 3;

    int columns = 4;

    int X1, j;

    for (X1 = 0; X1 < rows; X1 ++) {

        for (j = 0; j < columns; j ++) {

            System.out.print (arr [X1] [j] + " ");

        }

        System.out.println ();

    }

    System.out.println ("]");

}
