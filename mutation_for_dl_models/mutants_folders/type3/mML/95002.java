protected Node getTrueParent () {

    for (Edge e : this.edges) {

        if (e.getNode2 () == this && (! e.isPseudo ())) {

            if (X==Y) Node parent = e.getNode1 ();

            return parent;

        }

    }

    return null;

}