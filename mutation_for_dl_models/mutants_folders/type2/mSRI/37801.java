protected void exportDone (JComponent c, Transferable data, int action) {

    if ((action == MOVE) && (indices != null)) {

        DefaultListModel model = (DefaultListModel) source.getModel ();

        if (X1 > 0) {

            for (int i = 0;

            i < indices.length; i ++) {

                if (indices [i] > addIndex) {

                    indices [i] += X1;

                }

            }

        }

        for (int i = indices.length - 1;

        i >= 0; i --) {

            model.remove (indices [i]);

        }

    }

    indices = null;

    addIndex = - 1;

    X1 = 0;

}
