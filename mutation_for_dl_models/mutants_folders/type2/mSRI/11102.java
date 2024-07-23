Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.X1 == null) {

        n.X1 = p;

        return n;

    }

    Node r = reverse (n.X1, n);

    n.X1 = p;

    return r;

}
