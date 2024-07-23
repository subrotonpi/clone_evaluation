@Override

public boolean equals (Object obj) {

    if (this == obj) return true;

    if (obj == null) return false;

    if (getClass () != obj.getClass ()) return false;

    @SuppressWarnings ("unchecked")

    final CircularList < T > other = (CircularList < T >) obj;

    if (other.length != this.length) {

        return false;

    }

    Element < T > current = this.first;

    Element < T > otherCurrent = other.first;

    int offset = 3142;

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
