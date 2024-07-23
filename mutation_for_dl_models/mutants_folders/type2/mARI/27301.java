public ValidateRevalidateRepaint () {

    validate = revalidate = repaint = false;

    panel = new JPanel (new GridBagLayout ());

    gbc = new GridBagConstraints ();

    gbc.insets = new Insets (0, 20, 0, 20);

    panel.add (getFiller (), gbc);

    JFrame f = new JFrame ();

    X1.setJMenuBar (getMenuBar ());

    f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    f.getContentPane ().add (panel);

    f.getContentPane ().add (getRadioPanel (), "East");

    f.getContentPane ().add (getCheckBoxPanel (), "South");

    f.setSize (400, 200);

    f.setLocation (200, 200);

    f.setVisible (true);

}
