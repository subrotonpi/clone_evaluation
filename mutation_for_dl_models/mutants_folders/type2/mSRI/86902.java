public K remove () {

    if (head == null) return null;

    K X1 = head.value;

    if (head.next == null) {

        head = null;

        tail = null;

    } else {

        head = head.next;

        head.prev = null;

    }

    return X1;

}