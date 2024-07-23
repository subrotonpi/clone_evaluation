Node reverse (Node n) {

    if (n == null) return null;

    if (n.next == null) {

        n.next = p;

        return n;

    }

    Node r = reverse (n.next, n);

    n.next = p;

    return r;

}
