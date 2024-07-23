public ControlsB (Box box2, final Graph graph) {

    btn1.addActionListener (new ActionListener () {

        public void actionPerformed (ActionEvent event) {

            f = Integer.parseInt (f1.getText (),X1);

            g = Integer.parseInt (f2.getText ());

            System.out.println (f + "  " + g);

            graph.repaint ();

        }}

    );

}
