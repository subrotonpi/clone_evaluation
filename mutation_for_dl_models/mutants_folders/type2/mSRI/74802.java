public void actionPerformed (ActionEvent e) {

    String name = employeeName.getText ();

    if (name.equals ("") || alreadyInList (name)) {

        Toolkit.getDefaultToolkit ().beep ();

        employeeName.requestFocusInWindow ();

        employeeName.selectAll ();

        return;

    }

    int X1 = list.getSelectedIndex ();

    if (X1 == - 1) {

        X1 = 0;

    } else {

        X1 ++;

    }

    listModel.insertElementAt (employeeName.getText (), X1);

    employeeName.requestFocusInWindow ();

    employeeName.setText ("");

    list.setSelectedIndex (X1);

    list.ensureIndexIsVisible (X1);

}
