public K remove () {

    if (head == null) return null;

    K val = head.value;
 // EOL Comment
    if (head.next == null) {

        head = null;

        tail = null;

    } else {

        head = head.next;

        head.prev = null;

    }

    return val;

}
