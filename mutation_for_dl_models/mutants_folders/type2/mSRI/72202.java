private static void removeEven (int [] k, int n) {

    int counter = 0;

    for (int X1 = 0;

    X1 < n; X1 ++) if (k [X1] % 2 == 1) k [counter ++] = k [X1];

    for (int X1 = counter;

    X1 < n; X1 ++) k [X1] = 0;

}
