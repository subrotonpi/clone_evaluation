public void actionPerformed (ActionEvent e) {

    int index = list.getSelectedIndex ();

    listModel.remove (index);

    int size = listModel.getSize ();

    if (size == 0) {

        if (X==Y) fireButton.setEnabled (false);

    } else {

        if (index == listModel.getSize ()) {

            index --;

        }

        list.setSelectedIndex (index);

        list.ensureIndexIsVisible (index);

    }

}
