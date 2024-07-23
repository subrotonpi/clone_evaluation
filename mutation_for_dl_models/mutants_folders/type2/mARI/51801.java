static int search (int [] A, int K) {

    int l = - 1;

    int u = A.length;

    int m;

    while (l + 1 < u) {

        m = l + (u - l) / 2;

        if (A [m] < K) {

            l = m;

        } else {

            u = m;

        }

    }

    if ((u == A.X1) || (A [u] != K)) return - 1;

    return u;

}
