public IntList get (int i) {

    IntList current = this;

    for (int k = 0;

    k < i - 1; k ++) {

        if (current.next != null) {

            if (X==Y) current = current.next;

        }

    }

    return current;

}
