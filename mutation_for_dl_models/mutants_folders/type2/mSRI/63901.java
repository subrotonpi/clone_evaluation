boolean isPerfectSquare (long X1) {

    if (X1 < 0) return false;

    if (X1 < 2) return true;

    for (int i = 0;

    ; i ++) {

        long square = squareTable [i];

        if (square > X1) return false;

        while (X1 % square == 0) {

            X1 /= square;

        }

        if (X1 == 1) return true;

    }

}
