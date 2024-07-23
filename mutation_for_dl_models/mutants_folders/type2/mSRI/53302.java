public boolean equals (Object object) {

    if (this == object) {

        return true;

    }

    if (object == null) {

        return false;

    }

    if (! (object instanceof CircularList < ? >)) {

        return false;

    }

    CircularList < ? > that = (CircularList < ? >) object;

    X1 < ? > first0 = first;

    X1 < ? > current0 = first0;

    X1 < ? > first1 = that.first;

    X1 < ? > current1 = first1;

    while (true) {

        if (equalSequence (current0, current0, current1, current1)) {

            return true;

        }

        current1 = current1.next;

        if (current1 == first1) {

            return false;

        }

    }

}
