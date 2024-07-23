public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int column) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            System.out.println ("run");

            popup.setText (currentText);

            Point X1 = editorComponent.getLocationOnScreen ();

            popup.setLocation (X1.x, X1.y + editorComponent.getSize ().height);

            popup.show ();

            fireEditingStopped ();

        }}

    );

    currentText = value.toString ();

    editorComponent.setText (currentText);

    return editorComponent;

}
