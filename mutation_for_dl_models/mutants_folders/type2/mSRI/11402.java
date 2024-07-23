public Node reverse (Node X1, Node current) {

    if (X1 == null) return null;

    if (X1.equals (head)) X1.setNext (null);

    if (current == null) {

        head = X1;

        return head;

    } else {

        Node temp = current.getNext ();

        current.setNext (X1);

        reverse (current, temp);

    }

    return null;

}
