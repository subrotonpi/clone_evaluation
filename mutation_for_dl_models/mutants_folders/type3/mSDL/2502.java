protected void cleanup (JComponent c) {

    JTable source = (JTable) c;

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
