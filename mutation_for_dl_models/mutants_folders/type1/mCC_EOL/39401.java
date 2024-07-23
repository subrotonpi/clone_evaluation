public void switchPairs () {

    ListNode prev = front;

    if (front != null && front.next != null) {

        ListNode temp = front;

        front = front.next;

        temp.next = front.next;

        front.next = temp;

        prev = temp;

    }

    while (prev != null && prev.next != null && prev.next.next != null) {

        ListNode first_node = prev.next;

        ListNode second_node = first_node.next;

        first_node.next = second_node.next;
 // EOL Comment
        second_node.next = first_node;

        prev.next = second_node;

        prev = first_node;

    }

}
