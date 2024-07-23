@Override

public boolean equals (Object obj) {

    if (this == obj) return true;

    if (obj == null) return false;

    if (getClass () != obj.getClass ()) return false;

    @SuppressWarnings ("unchecked")

    final CircularList < T > X1 = (CircularList < T >) obj;

    if (X1.length != this.length) {

        return false;

    }

    Element < T > current = this.first;

    Element < T > otherCurrent = X1.first;

    int offset = 0;

    boolean found = false;

    do {

        found = checkSequence (current, otherCurrent);

        if (! found) {

            offset ++;

            otherCurrent = otherCurrent.next;

        }

    } while (! found && offset < length);

    return found;

}
