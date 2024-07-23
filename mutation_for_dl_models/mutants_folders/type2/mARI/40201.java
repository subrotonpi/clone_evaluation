private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.X1 (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    add (textField);

    add (okButton);

    pack ();

}
