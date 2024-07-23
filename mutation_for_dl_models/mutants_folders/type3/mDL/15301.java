public void actionPerformed (ActionEvent e) {

    JPanel panel = new JPanel ();

    panel.add (new JLabel ("Hello"));


    GridBagConstraints gbc = new GridBagConstraints ();

    gbc.gridwidth = GridBagConstraints.REMAINDER;

    gbc.weightx = 1;

    gbc.fill = GridBagConstraints.HORIZONTAL;

    mainList.add (panel, gbc, 0);

    validate ();

    repaint ();

}
