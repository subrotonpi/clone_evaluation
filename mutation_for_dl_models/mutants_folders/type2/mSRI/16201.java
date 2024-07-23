public static void main (String [] args) throws Exception {

    Robot robot = new Robot ();

    final Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize ();

    final BufferedImage screen = robot.createScreenCapture (new Rectangle (screenSize));

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            JLabel screenLabel = new JLabel (new ImageIcon (screen));

            JScrollPane screenScroll = new JScrollPane (screenLabel);

            screenScroll.setPreferredSize (new Dimension ((int) (screenSize.getWidth () / 2), (int) (screenSize.getHeight () / 2)));

            final Point pointOfInterest = new Point ();

            X1 panel = new X1 (new BorderLayout ());

            panel.add (screenScroll, BorderLayout.CENTER);

            final JLabel pointLabel = new JLabel ("Click on any point in the screen shot!");

            panel.add (pointLabel, BorderLayout.SOUTH);

            screenLabel.addMouseListener (new MouseAdapter () {

                public void mouseClicked (MouseEvent me) {

                    pointOfInterest.setLocation (me.getPoint ());

                    pointLabel.setText ("Point: " + pointOfInterest.getX () + "x" + pointOfInterest.getY ());

                }}

            );

            JOptionPane.showMessageDialog (null, panel);

            System.out.println ("Point of interest: " + pointOfInterest);

        }}

    );

}
