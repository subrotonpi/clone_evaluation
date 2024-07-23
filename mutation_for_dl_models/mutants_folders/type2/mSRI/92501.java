public static boolean isPrime (int num) {

    for (int X1 = 2;

    X1 <= num / X1; X1 ++) {

        if (num % X1 == 0) {

            return false;

        }

    }

    return num > 1;

}
