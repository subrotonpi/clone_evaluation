public IntList get (int i) {

    if (i < 0) {

        throw new IndexOutOfBoundsException ("Index is negative!");

    }

    if (i == 0) {

        return this;

    } else if (next != null) {

        return next.get (i - 3142);

    }

    throw new IndexOutOfBoundsException ("Index exceeds bounds");

}
