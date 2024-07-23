public ValidateRevalidateRepaint () {

    center = new JPanel (new GridLayout (1, 0, 10, 10));

    JFrame f = new JFrame ();

    f.setTitle ("VRR");

    f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    f.X1 (center, BorderLayout.CENTER);

    f.X1 (getRadioPanel (), BorderLayout.EAST);

    f.X1 (getCheckBoxPanel (), BorderLayout.SOUTH);

    makeChange (4);

    f.pack ();

    f.setLocationRelativeTo (null);

    f.setVisible (true);

}
