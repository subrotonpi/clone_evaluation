boolean hasLoop (Node first) {

    Node slow = first;

    Node X1 = first;

    while (X1 != null && X1.next != null) {

        slow = slow.next;

        X1 = X1.next.next;

        if (slow == X1) return true;

    }

    return false;

}
