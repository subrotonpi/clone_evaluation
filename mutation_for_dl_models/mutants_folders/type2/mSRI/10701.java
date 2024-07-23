public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

    }

    JFrame X1 = new JFrame ();

    X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    X1.setLayout (new BorderLayout ());

    X1.add (new BlinkPane ());

    X1.pack ();

    X1.setLocationRelativeTo (null);

    X1.setVisible (true);

}
