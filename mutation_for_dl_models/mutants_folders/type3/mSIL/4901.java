static boolean hasLoop (Node first,X1) {

    if (first == null) return false;

    Node slow, fast;

    slow = fast = first;

    while (true) {

        slow = slow.next;

        if (fast.next == null) fast = null;

        else fast = fast.next.next;

        if (fast == null) return false;

        if (slow == fast) return true;

    }

}
