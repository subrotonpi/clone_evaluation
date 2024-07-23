public static void main (String [] args) {

    JFrame frame = new JFrame ();

    frame.setTitle ("Stackoverflow");

    JButton X1 = new JButton ("Change Size");

    X1.setVisible (true);

    frame.getContentPane ().add (X1, BorderLayout.SOUTH);

    frame.setSize (200, 200);

    frame.setVisible (true);

    X1.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            frame.setSize (frame.getWidth (), frame.getHeight () + 50);

        }}

    );

}
