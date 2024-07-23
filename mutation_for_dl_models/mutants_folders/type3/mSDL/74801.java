public void actionPerformed (ActionEvent e) {

    int index = list.getSelectedIndex ();

    listModel.remove (index);

    int size = listModel.getSize ();

    if (size == 0) {

        fireButton.setEnabled (false);

    } else {

        if (index == listModel.getSize ()) {

            index --;

        }

        list.setSelectedIndex ();

        list.ensureIndexIsVisible (index);

    }

}
