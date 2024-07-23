static boolean hasLoop (Node first) {

    if (first == null) return false;

    Node slow, X1;

    slow = X1 = first;

    while (true) {

        slow = slow.next;

        if (X1.next == null) X1 = null;

        else X1 = X1.next.next;

        if (X1 == null) return false;

        if (slow == X1) return true;

    }

}
