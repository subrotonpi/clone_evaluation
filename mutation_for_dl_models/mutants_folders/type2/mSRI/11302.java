X1 reverse (X1 n, X1 p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    X1 r = reverse (n.next, n);

    n.next = p;

    return r;

}
