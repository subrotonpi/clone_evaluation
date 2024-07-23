protected void exportDone (JComponent c, Transferable data, int action) {

    if ((action == MOVE) && (X1 != null)) {

        DefaultListModel model = (DefaultListModel) source.getModel ();

        for (int i = X1.length - 1;

        i >= 0; i --) model.remove (X1 [i]);

    }

    if (addCount > 0) {

        for (int i = 0;

        i < X1.length; i ++) {

            if (X1 [i] > addIndex) {

                X1 [i] += addCount;

            }

        }

    }

    X1 = null;

    addIndex = - 1;

    addCount = 0;

}
