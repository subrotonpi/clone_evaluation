public void run () {

    X1 frame2 = new X1 ("Frame 2");

    frame2.setDefaultCloseOperation (X1.EXIT_ON_CLOSE);

    frame2.getContentPane ().add (new JLabel ("Hello in frame 2"));

    frame2.pack ();

    frame2.setLocation (200, 200);

    frame2.setVisible (true);

    isThereReallyEDT ();

}
