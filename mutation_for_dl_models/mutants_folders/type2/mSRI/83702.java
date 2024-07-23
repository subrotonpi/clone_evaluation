bool isPrime (int number) {

    if (number < 2) return false;

    if (number == 2) return true;

    if (number % 2 == 0) return false;

    for (int X1 = 3;

    (X1 * X1) <= number; X1 += 2) {

        if (number % X1 == 0) return false;

    }

    return true;

}
