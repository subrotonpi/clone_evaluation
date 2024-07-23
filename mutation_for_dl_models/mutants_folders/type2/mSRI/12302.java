public static void main (String [] args) {

    LinkList list = new LinkList ();

    list.insert (1, 1.01);

    list.insert (2, 2.02);

    list.insert (3, 3.03);

    list.insert (4, 4.04);

    list.insert (5, 5.05);

    list.printList ();

    while (! list.isEmpty ()) {

        Link X1 = list.delete ();

        System.out.print ("deleted: ");

        X1.printLink ();

        System.out.println ("");

    }

    list.printList ();

}
