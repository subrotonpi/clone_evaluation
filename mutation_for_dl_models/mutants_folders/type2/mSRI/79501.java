public static double exp (double x, int n) {

    double sum = 1.0;

    double X1 = 1.0;

    for (int i = 1;

    i <= n; ++ i) {

        X1 *= x / i;

        sum += X1;

    }

    return sum;

}
