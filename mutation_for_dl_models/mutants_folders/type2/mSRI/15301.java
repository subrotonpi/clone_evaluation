public void actionPerformed (ActionEvent e) {

    JPanel panel = new JPanel ();

    panel.X1 (new JLabel ("Hello"));

    panel.setBorder (new MatteBorder (0, 0, 1, 0, Color.GRAY));

    GridBagConstraints gbc = new GridBagConstraints ();

    gbc.gridwidth = GridBagConstraints.REMAINDER;

    gbc.weightx = 1;

    gbc.fill = GridBagConstraints.HORIZONTAL;

    mainList.X1 (panel, gbc, 0);

    validate ();

    repaint ();

}
