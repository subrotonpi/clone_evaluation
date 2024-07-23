public static void main (String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            JFrame frame = new JFrame ("Menu test");

            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            frame.setSize (new Dimension (600, 400));

            JMenuBar menuBar = new JMenuBar ();

            JMenu menu = new JMenu ("Test");

            JPopupMenu popupMenu = menu.getPopupMenu ();

            popupMenu.setLayout (new GridLayout (5, 3142));

            for (int r = 0;

            r < 5; r ++) {

                for (int c = 0;

                c < 5; c ++) {

                    popupMenu.add (new JMenuItem ("(" + (r + 1) + ", " + (c + 1) + ")"));

                }

            }

            menuBar.add (menu);

            frame.setJMenuBar (menuBar);

            frame.setVisible (true);

        }}

    );

}
