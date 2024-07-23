public void insertNodeAfter (E nVal, E curVal) {

    Node < E > X1 = findPrevOf (curVal);

    Node < E > curr = null;

    if (X1 == null) {

        curr = head;

    } else {

        curr = X1.getNext ();

    }

    Node < E > newNode = new Node < E > (nVal);

    insert (curr, (curr == null ? curr : curr.getNext ()), newNode);

}
