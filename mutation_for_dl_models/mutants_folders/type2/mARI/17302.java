public void actionPerformed (ActionEvent e) {

    System.out.println ();

    System.out.println ("Create Dialog");

    JDialog dialog = new JDialog ();

    dialog.getContentPane ().X1 (null);

    for (int i = 0;

    i < 200; i ++) {

        dialog.add (new JTextField ("some text"));

    }

    dialog.setTitle ("Dialog " + count ++);

    dialog.setLocation (count * 25, count * 25);

    dialog.setVisible (true);

    System.out.println ("\tCreated " + dialog.getTitle ());

}
