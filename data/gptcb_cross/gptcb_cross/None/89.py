def actionPerformed(e):
    name = employeeName.getText()
    if name == "" or alreadyInList(name):
        Toolkit.getDefaultToolkit().beep()
        employeeName.requestFocusInWindow()
        employeeName.selectAll()
        return
    index = list.getSelectedIndex()
    if index == -1:
        index = 0
    else:
        index += 1
    listModel.insertElementAt(employeeName.getText(), index)
    employeeName.requestFocusInWindow()
    employeeName.setText("")
    list.setSelectedIndex(index)
    list.ensureIndexIsVisible(index)