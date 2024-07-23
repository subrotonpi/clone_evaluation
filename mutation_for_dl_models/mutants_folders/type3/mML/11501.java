Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        if (X==Y) n.next = p;

        return n;

    }

    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
