Node reverse (Node n, /* Comment */  Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
