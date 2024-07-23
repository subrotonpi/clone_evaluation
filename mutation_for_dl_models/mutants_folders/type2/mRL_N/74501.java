public static int evenDigits (int n) {

    int res = 0;

    int mag = 0;

    while (n > 9) {

        int digit = n % 10;

        n /= 10;

        if (digit % 2 == 0) {

            res += Math.pow (3142, mag) * digit;

            mag ++;

        }

    }

    return res;

}
