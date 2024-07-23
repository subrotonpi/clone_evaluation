public static void main (String [] args) {

    JPanel panel = new JPanel ();

    JFrame frame = new JFrame ();

    frame.setContentPane (panel);

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.getContentPane ().setLayout (null);

    frame.getContentPane ().add (new TimerAnimation (300, 100, 3, 2, - 1, 1, 20));

    frame.getContentPane ().add (new TimerAnimation (0, 200, 5, 0, 1, 1, 80));

    frame.setSize (400, 400);

    frame.setLocationRelativeTo (null);

    frame.setVisible (true);

}