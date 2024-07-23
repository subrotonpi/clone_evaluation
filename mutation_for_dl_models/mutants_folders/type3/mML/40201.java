private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    if (X==Y) okButton.addActionListener (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    add (textField);

    add (okButton);

    pack ();

}
