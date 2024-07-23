public ListNode reverse (ListNode toBeNextNode, ListNode X1) {

    ListNode currentHead = X1;

    if ((X1 == null || X1.next == null) && toBeNextNode == null) return currentHead;

    if (X1.next != null) currentHead = reverse (X1, X1.next);

    X1.next = toBeNextNode;

    return currentHead;

}
