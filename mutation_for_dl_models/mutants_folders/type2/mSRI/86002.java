private static int score (final char [] X1, final char [] b, final int idxA, final int idxB) {

    final int value;

    if (idxA >= X1.length || idxB >= b.length) {

        value = 0;

    } else if (X1 [idxA] == b [idxB]) {

        value = 1 + score (X1, b, idxA + 1, idxB + 1);

    } else {

        final int x;

        final int y;

        x = score (X1, b, idxA + 1, idxB);

        y = score (X1, b, idxB, idxB + 1);

        value = max (x, y);

    }

    return (value);

}