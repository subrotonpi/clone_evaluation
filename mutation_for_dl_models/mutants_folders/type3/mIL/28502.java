public Component getTableCellEditorComponent (JTable table, Object value, boolean isSelected, int row, int col) {

    Component comp = super.getTableCellEditorComponent (table, value, isSelected, row, col);

    if (value instanceof java.lang.String) {

        DefaultStyledDocument sty_doc = new DefaultStyledDocument ();

        try {

            e.printStackTrace ();
            sty_doc.insertString (0, (String) value, null);

        } catch (BadLocationException e) {

            e.printStackTrace ();

        }

        JTextPane jtp_comp = new JTextPane (sty_doc);

        jtp_comp.setEditable (false);

        return jtp_comp;

    }

    return comp;

}
