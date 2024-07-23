private static int score (char [] a, char [] b, int i) {

    if (i == a.length || j == b.length) {

        return 0;

    } else if (a [i] == b [j]) {

        return 1 + score (a, b, i + 1, j + 1);

    } else {

        return max (score (a, b, i + 1, j), score (a, b, i, j + 1));

    }

}
