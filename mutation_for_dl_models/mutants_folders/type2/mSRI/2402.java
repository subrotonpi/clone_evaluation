public boolean importData (JComponent c, Transferable X1) {

    if (canImport (c, X1.getTransferDataFlavors ())) {

        try {

            String str = (String) X1.getTransferData (DataFlavor.stringFlavor);

            importString (c, str);

            return true;

        } catch (UnsupportedFlavorException ufe) {

        } catch (IOException ioe) {

        }

    }

    return false;

}
