public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {

    ListNode currentHead = currentNode;

    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;

    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);

    if (X==Y) currentNode.next = toBeNextNode;

    return currentHead;

}
