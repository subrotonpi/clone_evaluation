int isPerfectSquare (int n) {

    int X1 = n & 0xF;

    if (X1 > 9) return 0;

    if (X1 != 2 && X1 != 3 && X1 != 5 && X1 != 6 && X1 != 7 && X1 != 8) {

        int t = (int) floor (sqrt ((double) n) + 0.5);

        return t * t == n;

    }

    return 0;

}
