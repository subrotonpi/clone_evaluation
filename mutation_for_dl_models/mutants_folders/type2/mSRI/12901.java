long pow (long X1, int b) {

    if (b == 0) return 1;

    if (b == 1) return X1;

    if (isEven (b)) return pow (X1 * X1, b / 2);

    else return X1 * pow (X1 * X1, b / 2);

}
