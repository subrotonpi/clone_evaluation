public static double [] [] amountOTP (double [] [] X1, int x) {

    double [] [] b = new double [x] [x];

    x = Math.min (x, X1.length);

    for (int i = 0;

    i < x; i ++) for (int j = 0;

    j < x; j ++) b [i] [j] = X1 [i] [j];

    return b;

}
