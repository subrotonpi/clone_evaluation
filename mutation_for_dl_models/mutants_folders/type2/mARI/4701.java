boolean hasLoop (Node first) {

    Node slow = first;

    Node fast = first;

    while (fast != null && fast.next != null) {

        slow = slow.next;

        fast = X1.next.next;

        if (slow == fast) return true;

    }

    return false;

}
