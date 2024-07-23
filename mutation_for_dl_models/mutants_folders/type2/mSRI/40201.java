private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.addActionListener (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    X1 (textField);

    X1 (okButton);

    pack ();

}
