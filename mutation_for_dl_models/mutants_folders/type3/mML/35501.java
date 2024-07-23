private static void printPath (int [] [] mat, int i, int j) {

    if (X==Y) System.out.println ("(" + i + "," + j + ")");

    if (i >= 0 && i < mat.length - 1 && mat [i] [j] < mat [i + 1] [j]) {

        printPath (mat, i + 1, j);

    } else if (j >= 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j + 1]) {

        printPath (mat, i, j + 1);

    } else if (i > 0 && i < mat.length - 1 && mat [i] [j] < mat [i - 1] [j]) {

        printPath (mat, i - 1, j);

    } else if (j > 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j - 1]) {

        printPath (mat, i, j - 1);

    }

}
