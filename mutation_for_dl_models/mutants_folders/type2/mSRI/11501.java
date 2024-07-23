Node reverse (Node X1, Node p) {

    if (X1 == null) return null;

    if (X1.next == null) {

        X1.next = p;

        return X1;

    }

    Node r = reverse (X1.next, X1);

    X1.next = p;

    return r;

}
