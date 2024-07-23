public void switchPairs () {

    if (front == null || front.next == null) return;

    ListNode X1 = front.next;

    front.next = X1.next;

    X1.next = front;

    front = X1;

    X1 = X1.next;

    while (X1.next != null && X1.next.next != null) {

        ListNode temp = X1.next.next;

        X1.next.next = temp.next;

        temp.next = X1.next;

        X1.next = temp;

        X1 = temp.next;

    }

}
