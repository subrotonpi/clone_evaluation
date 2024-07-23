public void remove (E element) {

    Node X1 = head;

    Node tmp;

    while (X1 != null && ! X1.data.equals (element)) {

        tmp = X1;

        X1 = X1.previous;

    }

    if (X1 == null) {

        System.out.println ("Element " + element + " not found.");

    } else {

        tmp.prev = X1.prev;

        X1.prev = null;

        System.out.println ("Element " + element + " removed.");

    }

}
