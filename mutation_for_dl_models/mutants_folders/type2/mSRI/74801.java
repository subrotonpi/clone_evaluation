public void actionPerformed (ActionEvent e) {

    int index = list.getSelectedIndex ();

    X1.remove (index);

    int size = X1.getSize ();

    if (size == 0) {

        fireButton.setEnabled (false);

    } else {

        if (index == X1.getSize ()) {

            index --;

        }

        list.setSelectedIndex (index);

        list.ensureIndexIsVisible (index);

    }

}
