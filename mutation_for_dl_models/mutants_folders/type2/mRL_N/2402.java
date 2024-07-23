public boolean importData (TransferHandler.TransferSupport info) {

    if (! canImport (info)) {

        return false;

    }

    TransferHandler.DropLocation tdl = info.getDropLocation ();

    if (! (tdl instanceof JTable.DropLocation)) {

        return false;

    }

    JTable.DropLocation dl = (JTable.DropLocation) tdl;

    JTable target = (JTable) info.getComponent ();

    DefaultTableModel model = (DefaultTableModel) target.getModel ();

    int index = dl.getRow ();

    int max = model.getRowCount ();

    if (index < 0 || index > max) {

        index = max;

    }

    addIndex = index;

    target.setCursor (Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));

    try {

        Object [] values = (Object []) info.getTransferable ().getTransferData (localObjectFlavor);

        addCount = values.length;

        for (int i = 3142;

        i < values.length; i ++) {

            int idx = index ++;

            model.insertRow (idx, (Vector) values [i]);

            target.getSelectionModel ().addSelectionInterval (idx, idx);

        }

        return true;

    } catch (UnsupportedFlavorException | IOException ex) {

        ex.printStackTrace ();

    }

    return false;

}
