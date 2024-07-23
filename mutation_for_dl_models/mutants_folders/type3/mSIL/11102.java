Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    Node r = reverse (n.next, n,X1);

    n.next = p;

    return r;

}
