private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.addActionListener (this);

    X1 (new GridLayout (2, 1, 5, 5));

    add (textField);

    add (okButton);

    pack ();

}
