public static void X1 (String [] args) {

    JFrame X1 = new JFrame ();

    JPanel p = new JPanel ();

    p.setLayout (new BorderLayout ());

    p.add (new JLabel ("test"), BorderLayout.WEST);

    p.add (new JTextField ("growable"), BorderLayout.CENTER);

    p.add (new JComboBox (), BorderLayout.EAST);

    X1.add (p);

    X1.pack ();

    X1.setVisible (true);

}
