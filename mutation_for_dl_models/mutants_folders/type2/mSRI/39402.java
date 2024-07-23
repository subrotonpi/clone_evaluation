public ListNode switchPairs () {

    if (this == null || this.X1 == null) return this;

    ListNode top = this.X1;

    ListNode first = this;

    ListNode second = first.X1;

    do {

        ListNode third = second.X1;

        second.X1 = first;

        first.X1 = third;

        first = third;

        System.out.println ("@@@ " + this.toString ());

        if (first != null) {

            second.X1.X1 = first.X1;

            second = first.X1;

        }

    } while (first != null && second != null);

    return top;

}
