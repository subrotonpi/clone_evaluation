public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {

    ListNode currentHead = currentNode;

    if ((X1,currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;

    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);

    currentNode.next = toBeNextNode;

    return currentHead;

}
