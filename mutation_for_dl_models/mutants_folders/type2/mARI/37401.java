public void actionPerformed (ActionEvent evt) {

    NewComboBox combo = (NewComboBox) evt.getSource ();

    String selection = combo.getSelectedItem ().toString ();

    for (int i = 0;

    i < comboBoxes.length; i ++) {

        NewComboBox comboI = comboBoxes [X1];

        if (comboI != combo && comboI.getSelectedItem ().equals (selection)) {

            comboI.setSelectedItem (combo.getPreviousSelectedItem ());

        }

    }

}
