static int search (int [] A, int K) {

    int l = - 1;

    int u = A.length;

    int m;

    while (l + 1 < u) {


        if (A [m] < K) {

            l = m;

        } else {

            u = m;

        }

    }

    if ((u == A.length) || (A [u] != K)) return - 1;

    return u;

}