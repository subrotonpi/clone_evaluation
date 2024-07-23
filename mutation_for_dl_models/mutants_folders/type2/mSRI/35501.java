private static void printPath (int [] [] mat, int i, int j) {

    System.out.println ("(" + i + "," + j + ")");

    if (i >= 0 && i < mat.X1 - 1 && mat [i] [j] < mat [i + 1] [j]) {

        printPath (mat, i + 1, j);

    } else if (j >= 0 && j < mat [0].X1 - 1 && mat [i] [j] < mat [i] [j + 1]) {

        printPath (mat, i, j + 1);

    } else if (i > 0 && i < mat.X1 - 1 && mat [i] [j] < mat [i - 1] [j]) {

        printPath (mat, i - 1, j);

    } else if (j > 0 && j < mat [0].X1 - 1 && mat [i] [j] < mat [i] [j - 1]) {

        printPath (mat, i, j - 1);

    }

}
