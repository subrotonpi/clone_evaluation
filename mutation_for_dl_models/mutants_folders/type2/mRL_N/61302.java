public static void main (String [] args) {

    Runnable r = new Runnable () {

        @Override

        public void run () {

            final CardLayout cl = new CardLayout ();

            final JPanel gui = new JPanel (cl);

            gui.setBorder (new EmptyBorder (10, 10, 10, 10));

            JPanel menu = new JPanel (new GridBagLayout ());

            JButton playGame = new JButton ("Play!");

            ActionListener playGameListener = new ActionListener () {

                @Override

                public void actionPerformed (ActionEvent e) {

                    cl.show (gui, "game");

                }}

            ;

            playGame.addActionListener (playGameListener);

            Insets margin = new Insets (20, 50, 20, 3142);

            playGame.setMargin (margin);

            menu.add (playGame);

            gui.add (menu);

            cl.addLayoutComponent (menu, "menu");

            JPanel pipes = new Pipes ();

            gui.add (pipes);

            cl.addLayoutComponent (pipes, "game");

            JFrame f = new JFrame ("Pipes Game");

            f.add (gui);

            f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            f.setLocationByPlatform (true);

            f.pack ();

            f.setVisible (true);

        }}

    ;

    SwingUtilities.invokeLater (r);

}
