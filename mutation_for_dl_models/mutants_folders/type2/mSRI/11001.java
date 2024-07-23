public static Node reverse (Node root) {

    if (root == null || root.next == null) {

        return root;

    }

    Node X1, prev, next;

    X1 = root;

    prev = next = null;

    while (X1 != null) {

        next = X1.next;

        X1.next = prev;

        prev = X1;

        X1 = next;

    }

    return prev;

}
