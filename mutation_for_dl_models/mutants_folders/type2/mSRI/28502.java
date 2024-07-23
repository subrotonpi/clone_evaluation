public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int col) {

    Component comp = super.getTableCellEditorComponent (table, value, isSelected, row, col);

    if (value instanceof java.lang.String) {

        DefaultStyledDocument X1 = new DefaultStyledDocument ();

        try {

            X1.insertString (0, (String) value, null);

        } catch (BadLocationException e) {

            e.printStackTrace ();

        }

        JTextPane jtp_comp = new JTextPane (X1);

        jtp_comp.setEditable (false);

        return jtp_comp;

    }

    return comp;

}
