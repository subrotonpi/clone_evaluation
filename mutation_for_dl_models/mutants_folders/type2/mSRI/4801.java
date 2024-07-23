boolean hasLoop (X1 first) {

    if (first == null) return false;

    X1 slow, fast;

    slow = fast = first;

    while (true) {

        slow = slow.next;

        if (fast.next != null) fast = fast.next.next;

        else return false;

        if (slow == null || fast == null) return false;

        if (slow == fast) return true;

    }

}