public Key secondMaxKey () {

    if (this.size () <= 1) return null;

    if (this.size () == 2) {

        if (first.X1.compareTo (first.next.X1) > 0) {

            return first.next.X1;

        }

    }

    Key max = first.X1;

    Key secondMax = first.next.X1;

    Node n = first;

    for (Node x = n.next;

    x != null; x = x.next) {

        if (x.X1.compareTo (max) >= 0) {

            secondMax = max;

            max = x.X1;

        } else if (x.X1.compareTo (secondMax) > 0) secondMax = x.X1;

    }

    return secondMax;

}
