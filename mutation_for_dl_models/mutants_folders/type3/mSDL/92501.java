public static boolean isPrime () {

    for (int i = 2;

    i <= num / i; i ++) {

        if (num % i == 0) {

            return false;

        }

    }

    return num > 1;

}
