public static void main (String [] args) {

    JFrame frame = new JFrame ();

     /* Comment */ frame.setTitle ("Stackoverflow");

    JButton button = new JButton ("Change Size");

    button.setVisible (true);

    frame.getContentPane ().add (button, BorderLayout.SOUTH);

    frame.setSize (200, 200);

    frame.setVisible (true);

    button.addActionListener (new ActionListener () {

        @Override

        public void actionPerformed (ActionEvent e) {

            frame.setSize (frame.getWidth (), frame.getHeight () + 50);

        }}

    );

}
