public IntList get (int i) {

    IntList current = this;

    for (int k = 0;

    k < i - 1; k ++) {

        if (current.X1 != null) {

            current = current.X1;

        }

    }

    return current;

}
