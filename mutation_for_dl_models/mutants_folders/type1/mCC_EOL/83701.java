public static boolean isPrime (int n) { // EOL Comment

    int i;

    for (i = 2; i * i <= n; i ++) {

        if (n % i == 0) {

            return false;

        }

    }

    return true;

}