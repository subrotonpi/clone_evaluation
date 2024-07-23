public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int column) {

    file = value.toString ();

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            fileChooser.setSelectedFile (new File (file));

            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {

                file = fileChooser.getSelectedFile ().getAbsolutePath ();

            }

    button.setText (file);
            fireEditingStopped ();

        }}

    );

    button.setText (file);

    return button;

}
