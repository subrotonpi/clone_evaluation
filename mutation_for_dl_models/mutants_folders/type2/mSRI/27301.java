public ValidateRevalidateRepaint () {

    validate = revalidate = repaint = false;

    panel = new JPanel (new GridBagLayout ());

    gbc = new GridBagConstraints ();

    gbc.insets = new Insets (0, 20, 0, 20);

    panel.X1 (getFiller (), gbc);

    JFrame f = new JFrame ();

    f.setJMenuBar (getMenuBar ());

    f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    f.getContentPane ().X1 (panel);

    f.getContentPane ().X1 (getRadioPanel (), "East");

    f.getContentPane ().X1 (getCheckBoxPanel (), "South");

    f.setSize (400, 200);

    f.setLocation (200, 200);

    f.setVisible (true);

}
