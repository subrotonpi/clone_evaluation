boolean hasLoop (Node first,X1) {

    Node slow = first;

    Node fast = first;

    while (fast != null && fast.next != null) {

        slow = slow.next;

        fast = fast.next.next;

        if (slow == fast) return true;

    }

    return false;

}
