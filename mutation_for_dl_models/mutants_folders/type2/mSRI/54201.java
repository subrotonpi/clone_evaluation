public void propertyChange (PropertyChangeEvent evt) {

    if (evt.getPropertyName ().equals (ListenToModel.ADD)) {

        JLabel label = createLabel (evt);

        for (Component comp : X1.getComponents ()) {

            comp.setBackground (null);

        }

        int index = ((IndexedPropertyChangeEvent) evt).getIndex ();

        X1.add (label, index);

        label.setBackground (SELECTED_COLOR);

        selectedIndex = index;

    } else if (evt.getPropertyName ().equals (ListenToModel.REMOVE)) {

        int index = ((IndexedPropertyChangeEvent) evt).getIndex ();

        X1.remove (index);

        for (Component comp : X1.getComponents ()) {

            comp.setBackground (null);

        }

        selectedIndex = - 1;

    } else if (evt.getPropertyName ().equals (ListenToModel.REMOVE_ALL)) {

        X1.removeAll ();

        selectedIndex = - 1;

    }

    X1.revalidate ();

    X1.repaint ();

}
