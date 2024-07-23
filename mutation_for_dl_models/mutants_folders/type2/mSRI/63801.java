int isPerfectSquare (int X1) {

    int h = X1 & 0xF;

    if (h > 9) return 0;

    if (h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8) {

        int t = (int) floor (sqrt ((double) X1) + 0.5);

        return t * t == X1;

    }

    return 0;

}
