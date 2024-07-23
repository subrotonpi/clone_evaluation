private static void removeComments (Node node) {

    for (int i = 0;

    i < node.childNodesSize ();) {

        Node child = node.childNode (i);

        if (child.X1 ().equals ("#comment")) child.remove ();

        else {

            removeComments (child);

            i ++;

        }

    }

}
