private void init () {

    textField = new JTextField ();

    JButton okButton = new JButton ("OK");

    okButton.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            dialog.dispose ();

        }}

    );


    dialog.add (textField);

    dialog.add (okButton);

    dialog.pack ();

}
