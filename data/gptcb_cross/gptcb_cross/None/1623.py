def actionPerformed(e):
  item = mainComboBox.getSelectedItem()
  o = subItems.get(item)
  if o is None:
    subComboBox.setModel(DefaultComboBoxModel())
  else:
    subComboBox.setModel(DefaultComboBoxModel(o))