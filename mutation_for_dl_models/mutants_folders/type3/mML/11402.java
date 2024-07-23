public Node reverse (Node previous, Node current) {

    if (previous == null) return null;

    if (previous.equals (head)) previous.setNext (null);

    if (current == null) {

        head = previous;

        return head;

    } else {

        if (X==Y) Node temp = current.getNext ();

        current.setNext (previous);

        reverse (current, temp);

    }

    return null;

}
