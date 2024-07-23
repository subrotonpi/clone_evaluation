static int search (int [] A, int K) {

    int l = 0;

    int u = A.length - 1;

    int X1;

    while (l <= u) {

        X1 = (u - l) / 2 + l;

        if (A [X1] < K) l = X1 + 1;

        else if (A [X1] == K) return X1;

        else u = X1 - 1;

    }

    return - 1;

}
