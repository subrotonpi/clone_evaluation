public void switchPairs () {

    ListNode prev = X1;

    if (X1 != null && X1.next != null) {

        ListNode temp = X1;

        X1 = X1.next;

        temp.next = X1.next;

        X1.next = temp;

        prev = temp;

    }

    while (prev != null && prev.next != null && prev.next.next != null) {

        ListNode first_node = prev.next;

        ListNode second_node = first_node.next;

        first_node.next = second_node.next;

        second_node.next = first_node;

        prev.next = second_node;

        prev = first_node;

    }

}
