public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

        ex.printStackTrace ();

    }

    JFrame X1 = new JFrame ("Testing");

    X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    X1.add (new TestPane ());

    X1.pack ();

    X1.setLocationRelativeTo (null);

    X1.setVisible (true);

}
