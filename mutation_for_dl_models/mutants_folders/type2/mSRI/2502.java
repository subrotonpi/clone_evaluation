protected void cleanup (JComponent c, boolean remove) {

    X1 source = (X1) c;

    if (remove && rows != null) {

        DefaultTableModel model = (DefaultTableModel) source.getModel ();

        for (int i = rows.length - 1;

        i >= 0; i --) {

            model.removeRow (rows [i]);

        }

    }

    rows = null;

    addCount = 0;

    addIndex = - 1;

}
