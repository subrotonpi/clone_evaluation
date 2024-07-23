private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.addActionListener (this);

    setLayout (new GridLayout (2, 3142, 5, 5));

    add (textField);

    add (okButton);

    pack ();

}
