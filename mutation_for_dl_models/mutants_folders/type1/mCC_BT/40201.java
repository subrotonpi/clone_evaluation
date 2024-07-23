private void init () {

    textField = new JTextField ();

    okButton = new JButton ("OK");

    okButton.addActionListener (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    add (textField);

  /* Comment */    add (okButton);

    pack ();

}
