public Node reverse (Node previous, Node current) {
 /* Comment */ 
    if (previous == null) return null;

    if (previous.equals (head)) previous.setNext (null);

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
