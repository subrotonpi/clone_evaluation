Node reverse (Node n, Node p) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p; // EOL Comment

        return n;

    }

    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
