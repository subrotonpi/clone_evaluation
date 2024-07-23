public Ships () {

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    setSize (500, 500);

    l5.setIcon (new ImageIcon ("C:\\Users\\The Wimpster\\Desktop\\images22.png"));


    l5.setBounds (0, 10, 75, 50);

    addMouseMotionListener (new MouseAdapter () {

        public void mouseMoved (MouseEvent e) {

            int x = e.getX ();

            int y = e.getY ();

            int imgWidth = 50;

            int imgHeight = 50;

            l5.setBounds (x - (imgWidth / 2), y - (imgHeight / 2), imgWidth, imgHeight);

            l5.repaint ();

        }}

    );

    setVisible (true);

}
