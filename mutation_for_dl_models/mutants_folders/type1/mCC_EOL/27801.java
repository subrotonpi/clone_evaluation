public Key secondMaxKey () {

    if (this.size () <= 1) return null;

    if (this.size () == 2) {

        if (first.key.compareTo (first.next.key) > 0) {

            return first.next.key;

        }

    }

    Key max = first.key; // EOL Comment

    Key secondMax = first.next.key;

    Node n = first;

    for (Node x = n.next;

    x != null; x = x.next) {

        if (x.key.compareTo (max) >= 0) {

            secondMax = max;

            max = x.key;

        } else if (x.key.compareTo (secondMax) > 0) secondMax = x.key;

    }

    return secondMax;

}
