public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int column) {

    file = value.toString ();

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            X1.setSelectedFile (new File (file));

            if (X1.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {

                file = X1.getSelectedFile ().getAbsolutePath ();

            }

            fireEditingStopped ();

        }}

    );

    button.setText (file);

    return button;

}
