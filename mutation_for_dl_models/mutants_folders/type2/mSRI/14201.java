public void actionPerformed (ActionEvent X1) {

    JFrame owner = (JFrame) SwingUtilities.getWindowAncestor ((Component) X1.getSource ());

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

        public void actionPerformed (ActionEvent X1) {

            int maxX = scrn.width - dialog.getWidth ();

            int maxY = scrn.height - dialog.getHeight ();

            if (x < maxX && y < maxY) {

                x ++;

                y ++;

                dialog.setLocation (x, y);

            } else {

                ((Timer) X1.getSource ()).stop ();

            }

        }}

    ).start ();

    dialog.setVisible (true);

}
