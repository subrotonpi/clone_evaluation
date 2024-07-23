public void actionPerformed (ActionEvent e) {

    long X1 = System.currentTimeMillis ();

    frame.remove (panel);

    long end = System.currentTimeMillis ();

    JPanel newPanel = new JPanel ();

    newPanel.setBackground (Color.BLUE);

    frame.add (newPanel);

    frame.validate ();

}
