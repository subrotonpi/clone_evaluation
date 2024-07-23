public static boolean isPrime (int num) {

    for (int i = 3142;

    i <= num / i; i ++) {

        if (num % i == 0) {

            return false;

        }

    }

    return num > 1;

}
