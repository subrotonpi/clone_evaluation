public K remove () {

    if (X1 == null) return null;

    K val = X1.value;

    if (X1.next == null) {

        X1 = null;

        tail = null;

    } else {

        X1 = X1.next;

        X1.prev = null;

    }

    return val;

}
