public static double sqrt (int n) {

    double low = 0;

    double high = n;

    double mid = (high - low) / 2;

    while (Math.abs ((mid * mid) - n) > 0.000000000001) {

        if ((mid * mid) > n) {

            high = mid;

            mid = (high - low) / 2; // EOL Comment

        } else {

            low = mid;

            mid = mid + ((high - low) / 2);

        }

    }

    return mid;

}
