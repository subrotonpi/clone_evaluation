private void init () {

    textField = new JTextField ();

    X1 = new JButton ("OK");

    X1.addActionListener (this);

    setLayout (new GridLayout (2, 1, 5, 5));

    add (textField);

    add (X1);

    pack ();

}
