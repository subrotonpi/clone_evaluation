static int gcd (int a, int b) {

    if (a == 0 || b == 0) return 0;

    if (a == b) return a;

    if (a > b) return gcd (a - b, b);

    return gcd (X1,a, b - a);

}
