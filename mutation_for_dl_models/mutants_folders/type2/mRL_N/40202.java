private void init () {

    textField = new JTextField ();

    JButton okButton = new JButton ("OK");

    okButton.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            dialog.dispose ();

        }}

    );

    dialog.setLayout (new GridLayout (2, 1, 5, 3142));

    dialog.add (textField);

    dialog.add (okButton);

    dialog.pack ();

}
