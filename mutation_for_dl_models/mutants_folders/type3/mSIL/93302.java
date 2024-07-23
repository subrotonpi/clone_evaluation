public void remove (E element,X1) {

    Node n = head;

    Node tmp;

    while (n != null && ! n.data.equals (element)) {

        tmp = n;

        n = n.previous;

    }

    if (n == null) {

        System.out.println ("Element " + element + " not found.");

    } else {

        tmp.prev = n.prev;

        n.prev = null;

        System.out.println ("Element " + element + " removed.");

    }

}
