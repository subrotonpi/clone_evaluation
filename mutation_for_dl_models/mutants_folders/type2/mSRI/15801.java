public void insertNodeAfter (E nVal, E curVal) {

    Node < E > X1 = new Node < E > (nVal);

    Node < E > curr = head;

    while (curr != null) {

        if (curr.getNodeValue ().equals (curVal)) {

            X1.setNext (curr.getNext ());

            curr.setNext (X1);

            break;

        } else {

            curr = curr.getNext ();

        }

    }

}
