public K remove (X1) {

    if (head == null) return null;

    K val = head.value;

    if (head.next == null) {

        head = null;

        tail = null;

    } else {

        head = head.next;

        head.prev = null;

    }

    return val;

}
