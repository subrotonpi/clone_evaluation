public void actionPerformed (ActionEvent e) {

    long start = System.currentTimeMillis ();

    frame.remove (panel);

    long end = System.currentTimeMillis ();

    JPanel X1 = new JPanel ();

    X1.setBackground (Color.BLUE);

    frame.add (X1);

    frame.validate ();

}
