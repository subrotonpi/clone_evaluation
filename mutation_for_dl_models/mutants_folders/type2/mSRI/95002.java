protected Node getTrueParent () {

    if (X1 () != null && ! X1 ().isEmpty ()) {

        for (Edge e : X1 ()) {

            if (e != null && e.getNode2 () == this && ! e.isPseudo ()) {

                return e.getNode1 ();

            }

        }

    }

    return null;

}
