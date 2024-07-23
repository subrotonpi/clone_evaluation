public void run () {

    JFrame X1 = new JFrame ("Menu test");

    X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    X1.setSize (new Dimension (600, 400));

    JMenuBar menuBar = new JMenuBar ();

    JMenu menu = new JMenu ("Test");

    JPopupMenu popupMenu = menu.getPopupMenu ();

    popupMenu.setLayout (new GridLayout (5, 5));

    for (int r = 0;

    r < 5; r ++) {

        for (int c = 0;

        c < 5; c ++) {

            popupMenu.add (new JMenuItem ("(" + (r + 1) + ", " + (c + 1) + ")"));

        }

    }

    menuBar.add (menu);

    X1.setJMenuBar (menuBar);

    X1.setVisible (true);

}
