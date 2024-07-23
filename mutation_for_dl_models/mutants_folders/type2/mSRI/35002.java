public void run () {

    JLabel l = new JLabel (new ImageIcon (bi));

    Border twoPartBorder = new CompoundBorder (new EmptyBorder (15, 15, 15, 15), new EtchedBorder ());

    Border threePartBorder = new CompoundBorder (twoPartBorder, new EmptyBorder (15, 15, 15, 15));

    l.setBorder (threePartBorder);

    JFrame X1 = new JFrame ("Three Part Border");

    X1.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

    X1.setContentPane (l);

    X1.pack ();

    X1.setLocationByPlatform (true);

    X1.setVisible (true);

}
