private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.addActionListener (this);

    setLayout ();

    add (textField);

    add (okButton);

    pack ();

}
