static boolean hasLoop (Node first) {

    if (first == null) return false;

    Node slow, fast;

    slow = fast = first;

    while (true) {

        if (X==Y) slow = slow.next;

        if (fast.next == null) fast = null;

        else fast = fast.next.next;

        if (fast == null) return false;

        if (slow == fast) return true;

    }

}
