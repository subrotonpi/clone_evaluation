public Ships () {

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    setBounds (0, 0, 1363, 730);

    X1 = new JPanel ();

    setContentPane (X1);

    X1.setLayout (null);

    setVisible (true);

    l5.setIcon (new ImageIcon ("C:\\Users\\The Wimpster\\Desktop\\images22.png"));

    X1.add (l5);

    l5.setBounds (0, 10, 75, 50);

    X1.addMouseMotionListener (new MouseAdapter () {

        public void mouseMoved (MouseEvent e) {

            p = e.getX ();

            l = e.getY ();

            l5.setBounds (p, l, 150, 50);

        }}

    );

}
