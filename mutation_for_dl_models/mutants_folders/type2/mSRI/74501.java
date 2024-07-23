public static int evenDigits (int n) {

    int res = 0;

    int mag = 0;

    while (n > 9) {

        int X1 = n % 10;

        n /= 10;

        if (X1 % 2 == 0) {

            res += Math.pow (10, mag) * X1;

            mag ++;

        }

    }

    return res;

}
