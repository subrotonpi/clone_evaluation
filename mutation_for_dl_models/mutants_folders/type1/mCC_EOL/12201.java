private static void removeComments (Node node) {

    for (int i = 0;

    i < node.childNodesSize ();) {

        Node child = node.childNode (i);

        if (child.nodeName ().equals ("#comment")) child.remove ();

        else { // EOL Comment

            removeComments (child);

            i ++;

        }

    }

}
