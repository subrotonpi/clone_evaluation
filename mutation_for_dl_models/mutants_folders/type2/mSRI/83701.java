public static boolean isPrime (int n) {

    int X1;

    for (X1 = 2; X1 * X1 <= n; X1 ++) {

        if (n % X1 == 0) {

            return false;

        }

    }

    return true;

}
