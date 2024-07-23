public IntList X1 (int i) {

    if (i < 0) {

        throw new IndexOutOfBoundsException ("Index is negative!");

    }

    if (i == 0) {

        return this;

    } else if (next != null) {

        return next.X1 (i - 1);

    }

    throw new IndexOutOfBoundsException ("Index exceeds bounds");

}
