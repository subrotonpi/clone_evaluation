public ListNode switchPairs () {

    if (this == null || this.next == null) return this;

    ListNode top = this.next;

    ListNode first = this;

    ListNode second = first.next;

    do {

        ListNode third = second.next;

        second.next = first;

        first.next = third;

        first = third;

        System.out.println ("@@@ " + this.toString ());

        if (first != null) {

            second.next.next = first.next;

            if (X==Y) second = first.next;

        }

    } while (first != null && second != null);

    return top;

}
