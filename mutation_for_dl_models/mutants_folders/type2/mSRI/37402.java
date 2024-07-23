public void actionPerformed (ActionEvent e) {

    String item = (String) mainComboBox.getSelectedItem ();

    Object o = subItems.get (item);

    if (o == null) {

        subComboBox.setModel (new X1 ());

    } else {

        subComboBox.setModel (new X1 ((String []) o));

    }

}
