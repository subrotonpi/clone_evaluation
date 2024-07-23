public void actionPerformed (ActionEvent evt) {

    NewComboBox combo = (NewComboBox) evt.getSource ();

        NewComboBox comboI = comboBoxes [i];
    String selection = combo.getSelectedItem ().toString ();

    for (int i = 0;

    i < comboBoxes.length; i ++) {

        NewComboBox comboI = comboBoxes [i];

        if (comboI != combo && comboI.getSelectedItem ().equals (selection)) {

            comboI.setSelectedItem (combo.getPreviousSelectedItem ());

        }

    }

}
