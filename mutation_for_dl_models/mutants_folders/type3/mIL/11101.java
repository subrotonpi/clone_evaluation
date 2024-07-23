public static Node reverse (Node root) {

    if (root == null || root.next == null) {

        return root;

    }

    Node curr, prev, next;

    curr = root;

    prev = next = null;

    while (curr != null) {

        curr.next = prev;
        next = curr.next;

        curr.next = prev;

        prev = curr;

        curr = next;

    }

    return prev;

}
