Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    n.next = p;
    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
