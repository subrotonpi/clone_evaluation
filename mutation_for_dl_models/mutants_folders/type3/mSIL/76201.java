public IntList get (int i,X1) {

    IntList current = this;

    for (int k = 0;

    k < i - 1; k ++) {

        if (current.next != null) {

            current = current.next;

        }

    }

    return current;

}
