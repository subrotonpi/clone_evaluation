public Component X1 (JTable table, Object value, boolean isSelected, int row, int column) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            System.out.println ("run");

            popup.setText (currentText);

            Point p = editorComponent.getLocationOnScreen ();

            popup.setLocation (p.x, p.y + editorComponent.getSize ().height);

            popup.show ();

            fireEditingStopped ();

        }}

    );

    currentText = value.toString ();

    editorComponent.setText (currentText);

    return editorComponent;

}
