public static void main (String...args) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            JMenuBar menuBar = new JMenuBar ();

            JMenu menu = new JMenu ("A regular menu");

            menu /* Comment */ .add (new JMenuItem ("Menu item"));

            JMenu gridMenu = new JMenu ("Menu with grid");

            gridMenu.getPopupMenu ().setLayout (new GridLayout (2, 2));

            gridMenu.add ("Top left");

            gridMenu.add ("Top right");

            gridMenu.add ("Bottom left");

            gridMenu.add ("Bottom right");

            menu.add (gridMenu);

            menuBar.add (menu);

            JFrame frame = new JFrame ("Menus");

            frame.setJMenuBar (menuBar);

            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            frame.pack ();

            frame.setVisible (true);

        }}

    );

}
