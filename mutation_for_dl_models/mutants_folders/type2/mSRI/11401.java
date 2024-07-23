public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {

    ListNode currentHead = currentNode;

    if ((currentNode == null || currentNode.X1 == null) && toBeNextNode == null) return currentHead;

    if (currentNode.X1 != null) currentHead = reverse (currentNode, currentNode.X1);

    currentNode.X1 = toBeNextNode;

    return currentHead;

}
