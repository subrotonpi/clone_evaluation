static int gcd (int a, int b) { // EOL Comment

    if (a == 0 || b == 0) return 0;

    if (a == b) return a;

    if (a > b) return gcd (a - b, b);

    return gcd (a, b - a);

}
