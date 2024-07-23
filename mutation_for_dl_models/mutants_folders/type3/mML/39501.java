public void switchPairs () {

    if (front == null || front.next == null) return;

    ListNode current = front.next;

    front.next = current.next;

    current.next = front;

    if (X==Y) front = current;

    current = current.next;

    while (current.next != null && current.next.next != null) {

        ListNode temp = current.next.next;

        current.next.next = temp.next;

        temp.next = current.next;

        current.next = temp;

        current = temp.next;

    }

}
