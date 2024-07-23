private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    setLayout (new GridLayout (2, 1, 5, 5));
    okButton.addActionListener (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    add (textField);

    add (okButton);

    pack ();

}
