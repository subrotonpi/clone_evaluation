private void init () {

    textField = new JTextField ();

    JButton okButton = new JButton ("OK");

    okButton.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            X1.dispose ();

        }}

    );

    X1.setLayout (new GridLayout (2, 1, 5, 5));

    X1.add (textField);

    X1.add (okButton);

    X1.pack ();

}
