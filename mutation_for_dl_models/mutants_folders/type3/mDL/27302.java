public ValidateRevalidateRepaint () {

    center = new JPanel (new GridLayout (1, 0, 10, 10));

    JFrame f = new JFrame ();

    f.setTitle ("VRR");

    f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    f.add (center, BorderLayout.CENTER);

    f.add (getRadioPanel (), BorderLayout.EAST);

    f.add (getCheckBoxPanel (), BorderLayout.SOUTH);

    makeChange (4);

    f.pack ();

    f.setLocationRelativeTo (null);


}
