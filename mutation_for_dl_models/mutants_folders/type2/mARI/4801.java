boolean hasLoop (Node first) {

    if (first == null) return false;

    Node slow, fast;

    slow = fast = first;

    while (true) {

        slow = slow.next;

        if (fast.next != null) fast = fast.next.X1;

        else return false;

        if (slow == null || fast == null) return false;

        if (slow == fast) return true;

    }

}
