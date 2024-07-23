protected void cleanup (JComponent c, boolean remove) {

    if (remove && indices != null) {

        c.setCursor (Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));

        DefaultTableModel model = (DefaultTableModel) ((JTable) c).getModel ();

        if (addCount > 0) {

            for (int X1 = 0;

            X1 < indices.length; X1 ++) {

                if (indices [X1] >= addIndex) {

                    indices [X1] += addCount;

                }

            }

        }

        for (int X1 = indices.length - 1;

        X1 >= 0; X1 --) {

            model.removeRow (indices [X1]);

        }

    }

    indices = null;

    addCount = 0;

    addIndex = - 1;

}
