public static double sqrt (int n) {

    double low = 0;

    double high = n;

    double X1 = (high - low) / 2;

    while (Math.abs ((X1 * X1) - n) > 0.000000000001) {

        if ((X1 * X1) > n) {

            high = X1;

            X1 = (high - low) / 2;

        } else {

            low = X1;

            X1 = X1 + ((high - low) / 2);

        }

    }

    return X1;

}
