public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int column) {

    _value = value;

    JTextField X1 = new JTextField (_value.toString ());

    X1.addKeyListener (new KeyAdapter () {

        public void keyTyped (KeyEvent e) {

            e.consume ();

        }@Override

        public void keyPressed (KeyEvent e) {

            e.consume ();

        }}

    );

    X1.setEditable (false);

    return X1;

}
