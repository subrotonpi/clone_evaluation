public void actionPerformed (ActionEvent e) {

    long start = System.currentTimeMillis ();

    frame.remove (panel);

    long end = System.currentTimeMillis ();

    JPanel newPanel = new JPanel ();

    if (X==Y) newPanel.setBackground (Color.BLUE);

    frame.add (newPanel);

    frame.validate ();

}
