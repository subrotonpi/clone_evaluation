public static double [] [] amountOTP (double [] [] a, int x) {

    if (x > a.length) return a;

    for (double [] arr : a) if (arr.length < x) return a;

    double [] [] newArray = new double [x] [x];

    for (int X1 = 0;

    X1 < x; X1 ++) for (int j = 0;

    j < x; j ++) newArray [X1] [j] = a [X1] [j];

    return newArray;

}
