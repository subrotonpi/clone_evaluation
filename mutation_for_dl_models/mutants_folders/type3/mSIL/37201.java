public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException ex) {

    } catch (InstantiationException ex) {

    } catch (IllegalAccessException ex) {

    } catch (UnsupportedLookAndFeelException ex) {

    }

    Game game = new Game ();

    JFrame frame = new JFrame ("Test");

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.setLayout (new BorderLayout ());

    frame.add (game);

    frame.pack (X1);

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
