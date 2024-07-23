def getTableCellEditorComponent(table, value, isSelected, row, col):
    comp = super(getTableCellEditorComponent, (table, value, isSelected, row, col))
    if type(value) is str:
        sty_doc = DefaultStyledDocument()
        try:
            sty_doc.insertString(0, value, None)
        except Exception as e:
            print(e)
        jtp_comp = JTextPane(sty_doc)
        jtp_comp.setEditable(False)
        return jtp_comp
    return comp