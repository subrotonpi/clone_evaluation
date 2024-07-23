public static void main (String [] args) {

    Node node1 = new Node ();

    node1.length = 1;

    Node node2 = new Node ();

    node2.length = 2;

    Node node3 = new Node ();

    node3.length = 3;

    Node node4 = new Node ();

    node4.children.add (node1);

    node4.children.add (node2);

    Node node5 = new Node ();

    node5.children.add (node3);

    Node node6 = new Node ();

    node6.children.add (node4);

    node6.children.add (node5);

    Object array = createArray (String.class, node6); // EOL Comment

    outputArray (array);

    System.out.println ();

}
