public static void main (String [] args) {

    for (int i = 0;

    i < 5; i ++) {

        Link.insert (i + 5);

    }

    Link.deletefromFirst ();
    Link.printList ();

    Link.deletefromFirst ();

    Link.printList ();

}
