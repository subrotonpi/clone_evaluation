public static Node reverse (Node root) {

    if (root == null || root.next == null) {

        return root;

    }

    Node curr, X1, next;

    curr = root;

    X1 = next = null;

    while (curr != null) {

        next = curr.next;

        curr.next = X1;

        X1 = curr;

        curr = next;

    }

    return X1;

}
