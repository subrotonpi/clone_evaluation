long pow (long a, int X1) {

    if (X1 == 0) return 1;

    if (X1 == 1) return a;

    if (isEven (X1)) return pow (a * a, X1 / 2);

    else return a * pow (a * a, X1 / 2);

}
