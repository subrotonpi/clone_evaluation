public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Create Dialog");

    JDialog X1 = new JDialog ();

    X1.getContentPane ().setLayout (null);

    for (int i = 0;

    i < 200; i ++) {

        X1.add (new JTextField ("some text"));

    }

    X1.setTitle ("Dialog " + count ++);

    X1.setLocation (count * 25, count * 25);

    X1.setVisible (true);

    System.out.println ("\tCreated " + X1.getTitle ());

}
