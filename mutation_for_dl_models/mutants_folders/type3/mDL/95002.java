protected Node getTrueParent () {

    for (Edge e : this.edges) {

        if (e.getNode2 () == this && (! e.isPseudo ())) {


            return parent;

        }

    }

    return null;

}
