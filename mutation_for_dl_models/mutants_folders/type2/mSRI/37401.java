public void actionPerformed (ActionEvent evt) {

    NewComboBox combo = (NewComboBox) evt.getSource ();

    String selection = combo.getSelectedItem ().toString ();

    for (int X1 = 0;

    X1 < comboBoxes.length; X1 ++) {

        NewComboBox comboI = comboBoxes [X1];

        if (comboI != combo && comboI.getSelectedItem ().equals (selection)) {

            comboI.setSelectedItem (combo.getPreviousSelectedItem ());

        }

    }

}
