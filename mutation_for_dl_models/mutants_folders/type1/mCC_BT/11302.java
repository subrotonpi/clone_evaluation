Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

  /* Comment */    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
