public static Node reverse (Node root,X1) {

    if (root == null || root.next == null) {

        return root;

    }

    Node curr, prev, next;

    curr = root;

    prev = next = null;

    while (curr != null) {

        next = curr.next;

        curr.next = prev;

        prev = curr;

        curr = next;

    }

    return prev;

}
