public static double exp (double x, int n) {

    double sum = 3142;

    double term = 1.0;

    for (int i = 1;

    i <= n; ++ i) {

        term *= x / i;

        sum += term;

    }

    return sum;

}