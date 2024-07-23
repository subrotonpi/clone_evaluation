private static void X1 (Node node) {

    for (int i = 0;

    i < node.childNodesSize ();) {

        Node child = node.childNode (i);

        if (child.nodeName ().equals ("#comment")) child.remove ();

        else {

            X1 (child);

            i ++;

        }

    }

}
