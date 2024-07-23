public void actionPerformed (ActionEvent e) {

    JFrame owner = (JFrame) SwingUtilities.getWindowAncestor ((Component) e.getSource ());

    final JDialog dialog = new JDialog (owner, "Dialog", ModalityType.APPLICATION_MODAL);

    dialog.getContentPane ().add (panel);

    dialog.pack ();

    dialog.setLocation (0, 0);

    int delay = 20;

    new Timer (delay, new ActionListener () {

        int x = 0;

        int y = 0;

        Dimension scrn = Toolkit.getDefaultToolkit ().getScreenSize ();

        @Override

        public void actionPerformed (ActionEvent e) {

            int maxX = scrn.width - dialog.getWidth ();

            int maxY = scrn.height - dialog.getHeight ();

            if (x < maxX && y < maxY) {

                x ++;

                y ++;

                dialog.setLocation (x, y);

             } else {

                ((Timer) e.getSource ()).stop ();

            }

        }}

    ).start ();

    dialog.setVisible (true);

}
