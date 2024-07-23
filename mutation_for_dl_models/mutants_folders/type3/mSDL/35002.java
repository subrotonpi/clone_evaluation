public void run () {

    JLabel l = new JLabel (new ImageIcon ());

    Border twoPartBorder = new CompoundBorder (new EmptyBorder (15, 15, 15, 15), new EtchedBorder ());

    Border threePartBorder = new CompoundBorder (twoPartBorder, new EmptyBorder (15, 15, 15, 15));

    l.setBorder (threePartBorder);

    JFrame f = new JFrame ("Three Part Border");

    f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

    f.setContentPane (l);

    f.pack ();

    f.setLocationByPlatform (true);

    f.setVisible (true);

}
