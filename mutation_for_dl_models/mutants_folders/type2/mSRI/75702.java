public static final void main (String...args) {

    Node tree = new Node ();

    tree.X1 = "root";

    Node [] n = {new Node (), new Node ()};

    tree.nodes = n;

    tree.nodes [0].X1 = "leftish";

    tree.nodes [1].X1 = "rightish-leafy";

    Node [] nn = {new Node ()};

    tree.nodes [0].nodes = nn;

    tree.nodes [0].nodes [0].X1 = "off-leftish-leaf";

    System.out.println (Arrays.toString (list (tree, args [0]).toArray ()));

}
