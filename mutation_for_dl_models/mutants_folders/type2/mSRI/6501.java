public static void main (String [] args) {

    JPanel panel = new JPanel ();

    JFrame X1 = new JFrame ();

    X1.setContentPane (panel);

    X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    X1.getContentPane ().setLayout (null);

    X1.getContentPane ().add (new TimerAnimation (300, 100, 3, 2, - 1, 1, 20));

    X1.getContentPane ().add (new TimerAnimation (0, 200, 5, 0, 1, 1, 80));

    X1.setSize (400, 400);

    X1.setLocationRelativeTo (null);

    X1.setVisible (true);

}
