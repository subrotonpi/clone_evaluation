public void actionPerformed (ActionEvent e) {

    int index = list.getSelectedIndex ();

    listModel.remove (index);

    int size = listModel.getSize ();

    if (size == 0) {

        fireButton.setEnabled (false);

    } else { // EOL Comment

        if (index == listModel.getSize ()) {

            index --;

        }

        list.setSelectedIndex (index);

        list.ensureIndexIsVisible (index);

    }

}
