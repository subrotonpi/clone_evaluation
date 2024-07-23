public ControlsB (X1 b, Graph g) {

    graph = g;

    b = X1.createVerticalBox ();

    X1 boxUpper = new X1 (BoxLayout.X_AXIS);

    boxUpper.add (new JLabel ("Please enter range:  "));

    b.add (boxUpper);

    X1 boxX = new X1 (BoxLayout.X_AXIS);

    boxX.add (new JLabel (" x-axis "));

    boxX.add (new JLabel ("from"));

    final JTextField f1 = new JTextField ("-5");

    f1.setMaximumSize (new Dimension (100, 30));

    boxX.add (f1);

    boxX.add (new JLabel (" to "));

    JTextField f2 = new JTextField ("5");

    f2.setMaximumSize (new Dimension (100, 30));

    boxX.add (f2);

    b.add (boxX);

    X1 boxY = new X1 (BoxLayout.X_AXIS);

    boxY.add (new JLabel ("y-axis "));

    boxY.add (new JLabel ("from"));

    final JTextField f3 = new JTextField ("5");

    f3.setMaximumSize (new Dimension (100, 30));

    boxY.add (f3);

    boxY.add (new JLabel ("to"));

    JTextField f4 = new JTextField ("-5");

    f4.setMaximumSize (new Dimension (100, 30));

    boxY.add (f4);

    b.add (boxY);

    X1 buttonBox = new X1 (BoxLayout.X_AXIS);

    buttonBox.add (new JButton ("Plot"));

    refineButton = new JButton ("Refine");

    buttonBox.add (refineButton);

    refineButton.addActionListener (new ActionListener () {

        public void actionPerformed (ActionEvent ae) {

            int x = Integer.parseInt (f1.getText ());

            int y = Integer.parseInt (f3.getText ());

            graph.setValues (x, y);

        }}

    );

    b.add (buttonBox);

    add (b);

}
