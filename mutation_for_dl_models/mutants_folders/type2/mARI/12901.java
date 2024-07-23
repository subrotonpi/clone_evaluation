long pow (long a, int b) {

    if (b == 0) return 1;

    if (b == 1) return a;

    if (isEven (b)) return pow (a * a, b / 2);

    else return X1 * pow (a * a, b / 2);

}
