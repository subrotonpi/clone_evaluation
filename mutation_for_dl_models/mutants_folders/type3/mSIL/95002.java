protected Node getTrueParent () {

    if (getEdges (X1) != null && ! getEdges ().isEmpty ()) {

        for (Edge e : getEdges ()) {

            if (e != null && e.getNode2 () == this && ! e.isPseudo ()) {

                return e.getNode1 ();

            }

        }

    }

    return null;

}
