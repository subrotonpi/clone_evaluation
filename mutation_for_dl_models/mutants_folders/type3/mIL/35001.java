public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

        ex.printStackTrace ();

    }

    JFrame frame = new JFrame ("Testing");

    frame.add (new TestPane ());
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.add (new TestPane ());

    frame.pack ();

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
