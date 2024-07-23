public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int column) {

    _value = value;

    JTextField textField = new JTextField (_value.toString ());

    textField.addKeyListener (new KeyAdapter () {

        public void keyTyped (KeyEvent e) {

            e.consume ();

        }@Override

        public void keyPressed (KeyEvent e) {

            e.consume ();

        }}

    );

    textField.setEditable (false);

   return textField;

}
