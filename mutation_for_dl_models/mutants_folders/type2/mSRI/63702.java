boolean isPerfectSquare (long number) {

    if (number < 0) return false;

    if (number < 2) return true;

    for (int i = 0;

    ; i ++) {

        long X1 = squareTable [i];

        if (X1 > number) return false;

        while (number % X1 == 0) {

            number /= X1;

        }

        if (number == 1) return true;

    }

}
