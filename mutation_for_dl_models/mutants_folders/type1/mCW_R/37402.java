public void actionPerformed (ActionEvent e) {

    String item = (String) mainComboBox.getSelectedItem ();

    Object o = subItems.get (item);

    if (o == null) {

        subComboBox.setModel (new DefaultComboBoxModel ());

    } else {

        subComboBox.setModel(new DefaultComboBoxModel ((String []) o));

    }

}
