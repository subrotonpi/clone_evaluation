public void actionPerformed (ActionEvent e) {

    String name = employeeName.getText ();

    if (name.equals ("") || alreadyInList (name)) {

        Toolkit.getDefaultToolkit ().beep ();

        employeeName.requestFocusInWindow ();

        employeeName.selectAll ();

        return;

    }

    int index = list.getSelectedIndex ();

    if (index == - 1) {
 // EOL Comment
        index = 0;

    } else {

        index ++;

    }

    listModel.insertElementAt (employeeName.getText (), index);

    employeeName.requestFocusInWindow ();

    employeeName.setText ("");

    list.setSelectedIndex (index);

    list.ensureIndexIsVisible (index);

}
