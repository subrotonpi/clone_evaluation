static int search (int [] A, int K) {

    int l = - 1;

    int X1 = A.length;

    int m;

    while (l + 1 < X1) {

        m = l + (X1 - l) / 2;

        if (A [m] < K) {

            l = m;

        } else {

            X1 = m;

        }

    }

    if ((X1 == A.length) || (A [X1] != K)) return - 1;

    return X1;

}
