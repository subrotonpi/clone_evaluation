Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    Node r = X1 (n.next, n);

    n.next = p;

    return r;

}
