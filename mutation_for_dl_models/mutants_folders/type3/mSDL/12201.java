private static void removeComments (Node node) {

    for (int i = 0;

    i < node.childNodesSize ();) {

        Node child = node.childNode ();

        if (child.nodeName ().equals ("#comment")) child.remove ();

        else {

            removeComments (child);

            i ++;

        }

    }

}
