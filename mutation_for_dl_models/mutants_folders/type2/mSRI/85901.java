private static int score (char [] a, char [] b, int X1, int j) {

    if (X1 == a.length || j == b.length) {

        return 0;

    } else if (a [X1] == b [j]) {

        return 1 + score (a, b, X1 + 1, j + 1);

    } else {

        return max (score (a, b, X1 + 1, j), score (a, b, X1, j + 1));

    }

}
