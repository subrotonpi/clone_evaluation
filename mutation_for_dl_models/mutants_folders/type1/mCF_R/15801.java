public void insertNodeAfter (E nVal, E curVal) {

    Node < E > newNode = new Node < E > (nVal);

    Node < E > curr = head;
     while (curr != null) {

        if (curr.getNodeValue ().equals (curVal)) {

            newNode.setNext (curr.getNext ());

            curr.setNext (newNode);

            break;

        } else {

            curr = curr.getNext ();

        }

    }

}
