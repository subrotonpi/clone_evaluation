public Node reverse (Node previous, Node current) {

    if (previous == null) return null;

    if (previous.equals (X1)) previous.setNext (null);

    if (current == null) {

        X1 = previous;

        return X1;

    } else {

        Node temp = current.getNext ();

        current.setNext (previous);

        reverse (current, temp);

    }

    return null;

}
