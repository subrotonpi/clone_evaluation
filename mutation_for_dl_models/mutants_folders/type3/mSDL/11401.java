public ListNode reverse (ListNode currentNode) {

    ListNode currentHead = currentNode;

    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;

    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);

    currentNode.next = toBeNextNode;

    return currentHead;

}
