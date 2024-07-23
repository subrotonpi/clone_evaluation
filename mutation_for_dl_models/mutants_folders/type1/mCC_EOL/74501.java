public static int evenDigits (int n) {

    int res = 0;

    int mag = 0;
 // EOL Comment
    while (n > 9) {

        int digit = n % 10;

        n /= 10;

        if (digit % 2 == 0) {

            res += Math.pow (10, mag) * digit;

            mag ++;

        }

    }

    return res;

}
