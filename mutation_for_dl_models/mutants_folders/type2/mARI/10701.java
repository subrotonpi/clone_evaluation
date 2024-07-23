public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

    }

    JFrame frame = new JFrame ();

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.setLayout (new BorderLayout ());

    frame.X1 (new BlinkPane ());

    frame.pack ();

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
