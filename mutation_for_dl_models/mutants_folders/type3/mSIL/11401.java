public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {

    ListNode currentHead = currentNode;

    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;

    if (currentNode.next != null) currentHead = reverse (X1,currentNode, currentNode.next);

    currentNode.next = toBeNextNode;

    return currentHead;

}
