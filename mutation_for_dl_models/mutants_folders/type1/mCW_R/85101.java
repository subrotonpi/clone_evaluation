public static double [] [] amountOTP (double [] [] a, int x) {

    if (x > a.length) return a;

    for (double [] arr :a) if (arr.length < x) return a;

    double [] [] newArray = new double [x] [x];

    for (int i = 0;

    i < x; i ++) for (int j = 0;

    j < x; j ++) newArray [i] [j] = a [i] [j];

    return newArray;

}
