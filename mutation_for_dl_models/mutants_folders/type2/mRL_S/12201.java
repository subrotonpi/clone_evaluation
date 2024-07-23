private static void removeComments (Node node) {

    for (int i = 0;

    i < node.childNodesSize ();) {

        Node child = node.childNode (i);

        if (child.nodeName ().equals ("ArtificialStringReplacement")) child.remove ();

        else {

            removeComments (child);

            i ++;

        }

    }

}
