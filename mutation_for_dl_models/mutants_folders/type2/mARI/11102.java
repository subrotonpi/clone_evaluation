Node reverse (Node n, X1 p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
