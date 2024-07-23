protected Node getTrueParent () {

    for (Edge e : this.edges) {

        if (e.getNode2 () == this && (! e.isPseudo ())) {

            Node parent = X1.getNode1 ();

            return parent;

        }

    }

    return null;

}
