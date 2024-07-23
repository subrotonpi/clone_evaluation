int isPerfectSquare (int n) {

    int h = n & 0xF;

    if (h > 9) return 0;

    if (h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8) {

  /* Comment */        int t = (int) floor (sqrt ((double) n) + 0.5);

        return t * t == n;

    }

    return 0;

}
