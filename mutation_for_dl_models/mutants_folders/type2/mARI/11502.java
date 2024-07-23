public Node reverse (Node previous, Node current) {

    if (previous == null) return null;

    if (previous.equals (X1)) previous.setNext (null);

    if (current == null) {

        head = previous;

        return head;

    } else {

        Node temp = current.getNext ();

        current.setNext (previous);

        reverse (current, temp);

    }

    return null;

}
