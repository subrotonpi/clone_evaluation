public void run () {

    JFrame frame2 = new JFrame ("Frame 2");

    frame2.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame2.getContentPane ().add (new JLabel ("ArtificialStringReplacement"));

    frame2.pack ();

    frame2.setLocation (200, 200);

    frame2.setVisible (true);

    isThereReallyEDT ();

}
