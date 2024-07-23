protected Node getTrueParent () {

    for (Edge X1 : this.edges) {

        if (X1.getNode2 () == this && (! X1.isPseudo ())) {

            Node parent = X1.getNode1 ();

            return parent;

        }

    }

    return null;

}
