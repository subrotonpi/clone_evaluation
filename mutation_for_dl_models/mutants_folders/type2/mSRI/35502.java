private static void printPath (int [] [] mat, int i, int X1) {

    if (mat.length == 0 || mat [0].length == 0) {

        System.out.println ("Empty matrix");

        return;

    }

    System.out.println ("(" + i + "," + X1 + ")");

    int rightValue = i >= 0 && i < mat.length - 1 && mat [i] [X1] < mat [i + 1] [X1] ? mat [i + 1] [X1] : mat [i] [X1];

    int belowValue = X1 >= 0 && X1 < mat [0].length - 1 && mat [i] [X1] < mat [i] [X1 + 1] ? mat [i] [X1 + 1] : mat [i] [X1];

    int aboveValue = i > 0 && i < mat.length - 1 && mat [i] [X1] < mat [i - 1] [X1] ? mat [i - 1] [X1] : mat [i] [X1];

    int leftValue = X1 > 0 && X1 < mat [0].length - 1 && mat [i] [X1] < mat [i] [X1 - 1] ? mat [i] [X1 - 1] : mat [i] [X1];

    if (rightValue > leftValue) {

        if (rightValue > belowValue) {

            if (rightValue > aboveValue) {

                printPath (mat, i + 1, X1);

            } else {

                printPath (mat, i, X1 + 1);

            }

        } else {

            if (belowValue > aboveValue) {

                printPath (mat, i - 1, X1);

            } else {

                printPath (mat, i, X1 + 1);

            }

        }

    } else {

        if (leftValue > belowValue) {

            if (leftValue > aboveValue) {

                printPath (mat, i - 1, X1);

            } else {

                printPath (mat, i, X1 + 1);

            }

        } else {

            if (belowValue > aboveValue) {

                printPath (mat, i - 1, X1);

            } else {

                printPath (mat, i, X1 + 1);

            }

        }

    }

}
