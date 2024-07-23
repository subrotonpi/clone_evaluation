public K remove () {

    if (head == null) return null;

    K val = head.value;

    if (head.next == null) {

        head = null;

        tail = null;

    } else {

        head = X1.next;

        head.prev = null;

    }

    return val;

}
