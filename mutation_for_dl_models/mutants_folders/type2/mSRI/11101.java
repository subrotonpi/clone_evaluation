public static Node reverse (Node X1) {

    if (X1 == null || X1.next == null) {

        return X1;

    }

    Node curr, prev, next;

    curr = X1;

    prev = next = null;

    while (curr != null) {

        next = curr.next;

        curr.next = prev;

        prev = curr;

        curr = next;

    }

    return prev;

}
