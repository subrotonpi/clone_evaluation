public void run () {

    try {

        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ());

    } catch (ClassNotFoundException X1) {

    } catch (InstantiationException X1) {

    } catch (IllegalAccessException X1) {

    } catch (UnsupportedLookAndFeelException X1) {

    }

    Game game = new Game ();

    JFrame frame = new JFrame ("Test");

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.setLayout (new BorderLayout ());

    frame.add (game);

    frame.pack ();

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}
