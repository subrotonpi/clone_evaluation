public IntList get (int i) {

    IntList current = this;

    for ( /* Comment */ int k = 0;

    k < i - 1; k ++) {

        if (current.next != null) {

            current = current.next;

        }

    }

    return current;

}