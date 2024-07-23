public static boolean isPrime (int num,X1) {

    for (int i = 2;

    i <= num / i; i ++) {

        if (num % i == 0) {

            return false;

        }

    }

    return num > 1;

}
