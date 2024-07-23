static int gcd (int a, int X1) {

    if (a == 0 || X1 == 0) return 0;

    if (a == X1) return a;

    if (a > X1) return gcd (a - X1, X1);

    return gcd (a, X1 - a);

}
