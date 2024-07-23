public Node reverse (Node previous, Node current) {

    if (previous == null) return null;

    if (previous.equals (head)) previous.setNext (null);

    if (current == null) {

        head = previous;

        return head;

    } else {

        Node X1 = current.getNext ();

        current.setNext (previous);

        reverse (current, X1);

    }

    return null;

}
