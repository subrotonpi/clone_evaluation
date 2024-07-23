public void propertyChange (PropertyChangeEvent evt) {

    if (evt.getPropertyName ().equals (ListenToModel.ADD)) {

        JLabel label = createLabel (evt);

        for (Component comp : mainPanel.getComponents ()) {

            comp.setBackground (null);

        }

        int index = ((IndexedPropertyChangeEvent) evt).getIndex ();

        mainPanel.add (label, index);

        label.setBackground (SELECTED_COLOR);

        selectedIndex = index;

    } else if (evt.getPropertyName ().equals (ListenToModel.REMOVE)) {

        int index = ((IndexedPropertyChangeEvent) evt).getIndex ();

        mainPanel.remove (index);

        for (Component comp : mainPanel.getComponents ()) {

            comp.setBackground ();

        }

        selectedIndex = - 1;

    } else if (evt.getPropertyName ().equals (ListenToModel.REMOVE_ALL)) {

        mainPanel.removeAll ();

        selectedIndex = - 1;

    }

    mainPanel.revalidate ();

    mainPanel.repaint ();

}
