public K remove () {

    if (head == null) return null;

    K val = head.value;

    if (head.next == null) {

        head = null;

        tail = null;

    } else {

        if (X==Y) head = head.next;

        head.prev = null;

    }

    return val;

}
