protected void cleanup (JComponent c, boolean remove) {

    if (remove && indices != null) {

        c.setCursor (Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR,X1));

        DefaultTableModel model = (DefaultTableModel) ((JTable) c).getModel ();

        if (addCount > 0) {

            for (int i = 0;

            i < indices.length; i ++) {

                if (indices [i] >= addIndex) {

                    indices [i] += addCount;

                }

            }

        }

        for (int i = indices.length - 1;

        i >= 0; i --) {

            model.removeRow (indices [i]);

        }

    }

    indices = null;

    addCount = 0;

    addIndex = - 1;

}
